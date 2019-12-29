package practice2;

import java.util.Arrays;

public class SegregateTwoNumbers {

    public static void main(String[] args) {

        int[] arr = {0,1,0,1,0,1,0,0,1,0,1};

        int left = 0;
        int right = arr.length-1;

        while(left<right) {
            while(arr[left] == 0 ) {
                left++;
            }

            while(arr[right]==1){
                right--;
            }

//            if(left<right) {
                swap(left, right, arr);
                left++;
                right--;
//            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
