package practice1;

import java.util.HashMap;
import java.util.Map;


class LargestSubArraySum {	// Find maximum length sub-array with sum S present in the given array

    public static void maxLengthSubArray(int[] A, int sum)
    {

        Map<Integer, Integer> map = new HashMap<>();
        int sumSoFar = 0;
        int len = 0;
        int ending_index = -1;

        for (int i = 0; i < A.length; i++)
        {
            sumSoFar += A[i];

            if (!map.containsKey(sumSoFar))
                map.put(sumSoFar, i);

            if (map.containsKey(sumSoFar - sum) && len < i - map.get(sumSoFar - sum))
            {
                len = i - map.get(sumSoFar - sum);
                ending_index = i;
            }
        }
        System.out.println("[" + (ending_index - len + 1) + ", " + ending_index + "]");

        System.out.println("Subarray having sum=" + sum + " is:");
        for (int j = (ending_index - len + 1); j <= ending_index; j++) {
            System.out.print(A[j] + " ");
        }
    }

    public static void main (String[] args)	{
        int[] A = { 2, 8, -6, 3, -7, 11, 4, -2, 1};
        int sum = 6;

//        int[] A = {2, 3, -1, 5, 6, 1, 2, 3, 6, -2};
//        int sum = 10;
        maxLengthSubArray(A, sum);


    }
}
