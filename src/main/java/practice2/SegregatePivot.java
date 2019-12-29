package practice2;

import java.util.Arrays;

public class SegregatePivot {

    static void segregate(int[] arr) {

        int end = arr.length-1;
        int oneTracker = 0;
        int current = 0;

        while(current<=end) {
            if(arr[current]==0){
                swap(oneTracker,current,arr);
                oneTracker++;
                current++;
            } else if(arr[current]==1){
                current++;
            } else if (arr[current]==2) {
                swap(current,end,arr);
                //current++;
                end--;
            }
        }
    }

    static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] input = {1,0,0,2,1,1,0};
        System.out.println(Arrays.toString(input));
        segregate(input);
        System.out.println(Arrays.toString(input));
    }
}
