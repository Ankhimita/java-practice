package practice2;

import java.util.HashMap;

public class Equal1sAnd0s {
}


class LargestSubArray1
{

    // Returns largest subarray with equal number of 0s and 1s
    //int arr[] = {1, 0, 0, 1, 0, 1, 1};

    int maxLen(int arr[], int n)
    {

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0;
        int max_len = 0;
        int ending_index = -1;

        for (int i = 0; i < n; i++)
        {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }
        // Traverse through the given array

        for (int i = 0; i < n; i++)
        {
            // Add current element to sum
            sum += arr[i];

            if (sum == 0)
            {
                max_len = i + 1;
                ending_index = i;
            }
            // If this sum is seen before, then update max_len
            // if required
            if (hM.containsKey(sum))
            {
                if (max_len < i - hM.get(sum))
                {
                    max_len = i - hM.get(sum);
                    ending_index = i;
                }
            }
            else // Else put this sum in hash table
                hM.put(sum, i);
        }

        for (int i = 0; i < n; i++)
        {
            arr[i] = (arr[i] == -1) ? 0 : 1;
        }

        int startingIndex = ending_index - max_len + 1;
        System.out.println(startingIndex + " to " + ending_index);

        return max_len;
    }

    /* Driver program to practice5 the above functions */

    public static void main(String[] args)
    {
        LargestSubArray1 sub = new LargestSubArray1();
        int arr[] = {1, 0, 0, 1, 0, 1, 0};
        int n = arr.length;

        sub.maxLen(arr, n);
    }
}

// This code has been by Mayank Jaiswal(mayank_24)

