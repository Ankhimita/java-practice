package practice2;

public class ReverseWordsWithExtraSpace {

    public static void main(String[] args) {
        String input = " i like this program very much";
        char[] splitArray = input.toCharArray();

        for(int i=splitArray.length-1; i>=0; i--) {
            if(splitArray[i]=='\0'){
                System.out.println();
            }
        }
    }
}
