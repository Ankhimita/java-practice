package samples;

public class SolveHRank {

    public static void main(String[] args) {


//        StringBuilder sb = new StringBuilder();
//        while (number --> 0) {
//            sb.append((char)( + (number % 26)));
//            number = number/ 26;
//        }
//        System.out.println(sb.reverse().toString());
//
//
        long columnNumber = 703;
        StringBuilder columnName = new StringBuilder();
//        long rowNumber = 0l;
//       if(columnNumber%702 ==0) {
//           rowNumber = (columnNumber / 702);
//           columnName.append(rowNumber);
//       }else {
//           rowNumber = (columnNumber / 702)+1;
//           columnName.append(rowNumber);
//           columnNumber = columnNumber%702;
//       }


        while (columnNumber > 0)
        {
            // Find remainder
            long rem = columnNumber % 26;

            // If remainder is 0, then a
            // 'Z' must be there in output
            if (rem == 0)
            {
                columnName.append("Z");
                columnNumber = (columnNumber / 26) - 1;
            }
            else // If remainder is non-zero
            {
                columnName.append((char)((rem - 1) + 'A'));
                columnNumber = columnNumber / 26;
            }
        }

        System.out.println(columnName);

    }
}
