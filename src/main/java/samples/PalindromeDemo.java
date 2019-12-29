package samples;

import java.util.Scanner;

public class PalindromeDemo {

    public static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input String1->");
        String s1Input = sc.nextLine();

        System.out.println("Input String2->");
        String s2Input = sc.nextLine();

        char[] s1Array = s1Input.toCharArray();
        char[] s2Array = s2Input.toCharArray();

        if((2*s2Array.length)>s1Array.length && !isPalindrome(s2Input)) {
            System.out.println("Substring s2 is too lengthy to manipulate s1 as palindrome containing s2");
            System.exit(1);
        }

        int s1length = s1Input.length();
        int s2length = s2Input.length();

        char[] firstHalf = new char[(s1length+1)/2];
        char[] secondHalf = new char[(s1length)-firstHalf.length];

        System.arraycopy(s1Array,0,firstHalf,0,firstHalf.length);
        System.arraycopy(s1Array,firstHalf.length,secondHalf,0,secondHalf.length);

        if(isPalindrome(s2Input)) {

            int indexToCheck = s1length-s2length-1;

            for(int i= indexToCheck; i<=s2length; i++) {
                int j=0;
                if(s1Array[i]!=s2Array[j] ) {
                    s1Array[i]=s2Array[j];
                    count++;
                }
            }
        } else {
            if(!firstHalf.toString().contains(s2Input) && !secondHalf.toString().contains(s2Input)) {
                for(int i=0; i<s2length; i++){
                    if(firstHalf[i]!=s2Array[i]) {
                        firstHalf[i] = s2Array[i];
                        count++;
                    }
                }
            }
        }

        for(int i=0,j=secondHalf.length-1; i<secondHalf.length; i++,j--) {
            if(firstHalf[i]!=secondHalf[j]){
                count++;
            }
        }

        System.out.println("Minimum Operations required=" + count);
    }

    private static boolean isPalindrome(String s1) {
        String reverse = new StringBuffer(s1).reverse().toString();
        if(s1.equals(reverse)) {
            return true;
        }
        return false;
    }

}
