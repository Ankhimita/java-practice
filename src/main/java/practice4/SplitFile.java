package practice4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SplitFile {
    public static void main(String[] args) throws IOException {
        splitTextFiles("/Users/filePath", 100000, "/Users/ankhimic/Downloads/splitFiles/");
    }

    public static void splitTextFiles(String fileName, int maxRows, String targetDir) throws IOException {
        File bigFile = new File(fileName);
        int i = 1;
        String ext = fileName.substring(fileName.lastIndexOf("."));

        String fileNoExt = bigFile.getName().replace(ext, "");
        File newDir = null;
        if (targetDir != null) {
            newDir = new File(targetDir);
        } else {
            newDir = new File(bigFile.getParent() + "/" + fileNoExt + "_split");
        }
        newDir.mkdirs();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line = null;
            int lineNum = 1;
            Path splitFile = Paths.get(newDir.getPath() + "/" + fileNoExt + "_" + String.format("%02d", i) + ext);
            BufferedWriter writer = Files.newBufferedWriter(splitFile, StandardOpenOption.CREATE);
            while ((line = reader.readLine()) != null) {
                if (lineNum == 1) {
                    System.out.print("new file created '" + splitFile.toString());
                }
                writer.append(line);

                if (lineNum >= maxRows) {
                    writer.close();
                    System.out.println(", " + lineNum + " lines written to file");
                    lineNum = 1;
                    i++;
                    splitFile = Paths.get(newDir.getPath() + "/" + fileNoExt + "_" + String.format("%02d", i) + ext);
                    writer = Files.newBufferedWriter(splitFile, StandardOpenOption.CREATE);
                } else {
                    writer.newLine();
                    lineNum++;
                }
            }

            writer.close();
            System.out.println(", " + lineNum + " lines written to file");
        }

        System.out.println("file '" + bigFile.getName() + "' split into " + i + " files");
    }
}
