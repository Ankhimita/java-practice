package practice2;

public class ReverseWords {

    public static void main(String[] args) {

        String input = " i like this program very much";
        String[] splitArray = input.split(" ");
        StringBuilder reverse = new StringBuilder();

        int i=splitArray.length-1;
        while(i>0) {
            reverse.append(splitArray[i]);
            reverse.append(" ");
            i--;
        }
        reverse.append(splitArray[i]);

        System.out.println(reverse.toString());
    }
}
