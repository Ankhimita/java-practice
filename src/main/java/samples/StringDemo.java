package samples;

public class StringDemo {

    public static void main(String[] args) {

        String sentence = "This is   a   good day";
        String output = delSpaces2(sentence);
        System.out.println(output);

    }

    private static String delSpaces(String str){    //custom method to remove multiple space
        StringBuilder sb=new StringBuilder();
        for(String s: str.split(" ")){

            if(!s.equals(""))        // ignore space
                sb.append(s+" ");       // add word with 1 space

        }
        return new String(sb.toString());
    }

    public static String delSpaces2(String str){
        int space=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                space++;
                if(space==1){       // add 1st space
                    sb.append(" ");
                }
            }else{
                sb.append(str.charAt(i));  // add character
                space=0;
            }
        }
        return new String(sb.toString());
    }
}
