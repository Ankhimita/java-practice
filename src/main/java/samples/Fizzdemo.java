package samples;

import java.util.Scanner;

public class Fizzdemo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numberOfTestCases = s.nextInt();

        int[] input = new int[numberOfTestCases];
        for(int i=0; i<numberOfTestCases; i++) {
            input[i] = s.nextInt();
        }

        for(int i=0; i<numberOfTestCases; i++) {
            int range = input[i];
            for (int j = 1; j <= range; j++) {
                if (j % 3 == 0 && j % 5 == 0) {
                    System.out.println("FizzBuzz\n");
                } else if (j % 3 == 0) {
                    System.out.println("Fizz\n");
                } else if (j % 5 == 0) {
                    System.out.println("Buzz\n");
                } else {
                    System.out.println(j+"\n");
                }
            }
        }

    }
}
