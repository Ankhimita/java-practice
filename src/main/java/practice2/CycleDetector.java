package practice2;

import java.util.*;

public class CycleDetector {

    public static void main(String[] args) {

        int input[] = new int[]{2,3,3,1,0};
        int startIndex = 2; //user input

        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(startIndex);


        if(input.length==0 || input.length==1) {
            System.out.println("Elements should be more than one to have cycle");
        }

        int nextIndex = input[startIndex];

        int cycleLen = 0;
        int traversal = 1;


        while (nextIndex < input.length){

            if(!mySet.add(nextIndex)) {
                cycleLen=traversal ;
                break;
            } else {
                mySet.add(nextIndex);
                traversal++;
            }

            nextIndex = input[nextIndex];
        }

        System.out.println("CycleDetected= " + cycleLen);

    }
}
