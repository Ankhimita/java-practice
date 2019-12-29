package practice2;

public class ReverseWordsWithoutExtraSpace {

    static String reverse(String str) {

        int i = str.length()-1;
        int start;
        int end = i+1;

        String result = "";

        while(i>=0) {

            if(str.charAt(i)==' ') {
                start = i+1;

                while(start!=end) {
                  result= result + str.charAt(start);
                  start++;
                }

                result = result + " ";

                end = i;
            }
            i--;
        }

        start = 0;
        while(start!=end) {
            result = result+ str.charAt(start++);
        }

        return result;
    }

    public static void main(String[] args) {

        String input = "I am a geek";
        System.out.println(reverse(input));
    }
}
