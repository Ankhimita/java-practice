package practice4;

public class SquareRoot {

    static int count = 0 ;
    static int repeatedSqrt(double num) {
        double sqrt = Math.sqrt(num);
        if (checkPerfectSquare(sqrt)) {
            count = count + repeatedSqrt(sqrt);
        } else {
            return count;
        }
        return 0;
    }

    static boolean checkPerfectSquare(double x)
    {

        // finding the square root of given number
        double sq = Math.sqrt(x);

        /* Math.floor() returns closest integer value, for
         * example Math.floor of 984.1 is 984, so if the value
         * of sq is non integer than the below expression would
         * be non-zero.
         */
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String args[]) {
        System.out.println(repeatedSqrt(6561));
    }
}
