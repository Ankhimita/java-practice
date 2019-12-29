package practice1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("/Dirpath/testWrite.csv", true));
        StringBuffer oneLine = new StringBuffer();
        oneLine.append("56").append(",");
        oneLine.append("hjgj");
        bw.write(oneLine.toString());
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
