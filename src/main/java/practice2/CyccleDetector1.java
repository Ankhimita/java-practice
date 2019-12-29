package practice2;

public class CyccleDetector1 {

    public static void main(String[] args) {

        int input[] = new int[]{3,4,0,1,5,6,4};
        int startIndex = 0; //user input

        boolean flag = true;
        int matchElement = input[startIndex];
        int count =1 ;

        while (flag){
            if(input[(input[startIndex])]== matchElement){
                flag=false;
            }else {
                startIndex =input[startIndex];
                count++;
            }

        }

        System.out.println(count);
    }
}
