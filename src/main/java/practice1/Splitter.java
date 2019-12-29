package practice1;

import java.io.*;

public class Splitter {
    /**
     * @param args
     */
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Splitter readOrigFile = new Splitter();
        readOrigFile.loadFile("/Users/ankhimic/Documents/RR_dump/rr_dump.csv");

    }

    public void loadFile(String filename) {
        int numLines = 0;
        int numLinesBreak = 0;
        int fileNumber = 1;
        File file = new File(filename);
        FileReader fileReader;
        String splitFilePathPrefix = "/Users/ankhimic/Documents/RRdump_splits/rr_dump_";
        try {
            fileReader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line = null;
            String headerLine = null;
            StringBuffer breakLine = new StringBuffer();
            String splitFileName = null;
            File splitFile = null;
            FileWriter fileWritter = null;
            PrintWriter bufferWritter = null;
            headerLine = bufReader.readLine();
            while ((line = bufReader.readLine()) != null) {
                numLines++;
                numLinesBreak++;
                breakLine.append(line + "\n");
                if (numLinesBreak == 1000) {
                    splitFileName = splitFilePathPrefix + fileNumber + ".csv";
                    splitFile = new File(splitFileName);
                    if (splitFile.exists()) {
                        splitFile.delete();
                        splitFile.createNewFile();
                    }
                    fileWritter = new FileWriter(splitFile);
                    bufferWritter = new PrintWriter(fileWritter);
                    breakLine.deleteCharAt(breakLine.length() - 1);//remove last newline
                    bufferWritter.println(headerLine);
                    bufferWritter.println(breakLine.toString());
                    bufferWritter.close();
                    fileWritter.close();
                    fileNumber++;
                    numLinesBreak = 0;
                    breakLine.setLength(0);
                }
            }
            splitFileName = splitFilePathPrefix + fileNumber + ".txt";
            splitFile = new File(splitFileName);
            if (splitFile.exists()) {
                splitFile.delete();
                splitFile.createNewFile();
            }
            fileWritter = new FileWriter(splitFile);
            bufferWritter = new PrintWriter(fileWritter);
            breakLine.deleteCharAt(breakLine.length() - 1);//remove last newline
            bufferWritter.println(headerLine);
            bufferWritter.println(breakLine.toString());
            bufferWritter.close();
            fileWritter.close();
            fileNumber++;
            numLinesBreak = 0;
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}