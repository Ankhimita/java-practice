package practice2;

public class ExcelColumn {

    public static void main(String[] args) {

        long columnNumber = 700;
        long rowNum = 0;

        StringBuilder columnName = new StringBuilder();

        if(columnNumber>702) {
        rowNum = columnNumber/702;

        long displayRowNum = rowNum+1;
        if(displayRowNum!=1) {
            columnName.append(displayRowNum);
        }


            columnNumber = columnNumber - (rowNum * 702);
        }

        while(columnNumber>0) {
            long rem = columnNumber%26;
            char alpha ='\0';
            if(rem!=0) {
                alpha = (char) ('A' + rem-1);
                columnNumber = (columnNumber/26);
            } else {
                alpha = 'Z';
                columnNumber = (columnNumber/26)-1;
            }
            columnName.append(alpha);
        }


        System.out.println(columnName.reverse().toString());


    }
}
