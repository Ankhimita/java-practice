package practice3;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 0, -3, -10, -11};

        int maxEnding = arr[0];
        int minEnding = arr[0];
        int maxSoFar = arr[0];

        for(int i=1;i<arr.length;i++) {
            if(arr[i] < 0) {
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(arr[i],maxEnding*arr[i]);
            minEnding = Math.min(arr[i], minEnding*arr[i]);

            maxSoFar = Math.max(maxEnding, maxSoFar);
        }

        System.out.println(maxSoFar);
    }

}
