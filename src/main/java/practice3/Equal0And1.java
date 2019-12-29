package practice3;

import java.util.HashMap;
import java.util.Map;

public class Equal0And1 {

    public static void main(String[] args) {

//        int[] input = new int[] {0,0,1,0,0,1,0,1,0};
        int[] input = new int[] {1, 0, 0, 1, 0, 1, 1};
        int sum=0;
        int maxLength = 0;
        int endingIndex = -1;


        for(int i=0; i<input.length; i++) {
            input[i] = (input[i]==0) ? -1 : 1;
        }

        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();

        for(int i=0; i<input.length; i++) {
            sum = sum + input[i];

            if(sum==0) {
                maxLength = i+1;
                endingIndex = i;
            }

            if(countMap.containsKey(sum)) {
                if(maxLength< (i-countMap.get(sum))){
                    maxLength = i-countMap.get(sum);
                    endingIndex = i;
                }
            } else {
                countMap.put(sum,i);
            }
        }

        System.out.println("Maxlength= " + maxLength);
        System.out.println("Starting Index= " + (endingIndex-maxLength +1));
        System.out.println("Ending Index= " + endingIndex);
    }
}
