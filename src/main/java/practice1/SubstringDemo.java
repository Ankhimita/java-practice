package practice1;

public class SubstringDemo {

    static String s1 = "abcde";
    static String s2 = "de";

    public static void main(String[] args) {

        int i=0;
        int j=0;
        boolean match = false;

        while(i<s1.length()) {

            if(s1.charAt(i)==s2.charAt(j)) {
                match= isMatch(i,s2.length());
            }

            if(match==true){
                break;
            }else {
                j=0;
                i++;
            }
        }

        if(match==true) {
            System.out.println("s2 is a substring of s1");
        } else {
            System.out.println("s2 not a substring of s1");
        }

    }

    private static boolean isMatch(int startIndex, int s2len) {

        for(int j=startIndex; j<s2len; j++) {
            if(s1.charAt(j)!=s2.charAt(j)){
                return false;
            }
        }
        return true;
    }

}
