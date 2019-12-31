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
                match= isMatch(i+1,j+1,s2.length()-1);
            }

            if(match==true){
                break;
            }else {
                i++;
            }
        }

        if(match==true) {
            System.out.println("s2 is a substring of s1");
        } else {
            System.out.println("s2 not a substring of s1");
        }

    }

    private static boolean isMatch(int i, int j, int s2len) {

//        for(int i=startIndex; j<s2len; j++, i++) {
//            if(s1.charAt(i)!=s2.charAt(j)){
//                return false;
//            }
//        }

        while(j<s2len) {
            if(s1.charAt(i)!=s2.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

}
