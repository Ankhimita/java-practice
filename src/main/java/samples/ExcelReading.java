package samples;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExcelReading {

    public static void echoAsCSV(Sheet sheet) throws IOException {

        System.out.println("header: "+ sheet.getHeader().toString());

        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/ankhimic/Documents/Book1.csv")));

        Row row = null;
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                bw.append(row.getCell(j).getStringCellValue());
                bw.append("\n");
                System.out.print("\"" + row.getCell(j) + "\";");
            }
            System.out.println();
        }

        bw.flush();
        bw.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStream inp = null;
        try {
            inp = new FileInputStream("/Users/ankhimic/Documents/Book1.xlsx");
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheetAt(0);

                echoAsCSV(wb.getSheetAt(0));

        } catch (InvalidFormatException ex) {
            Logger.getLogger(ExcelReading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExcelReading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExcelReading.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                inp.close();
            } catch (IOException ex) {
                Logger.getLogger(ExcelReading.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
