package practice2;

public class MaxProductSubArray {

    public static void main(String[] args) {

        int[] arr = {5, -1, 0, -3, -10, -11};
        int n = arr.length;

        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];

        int maxProduct = arr[0];

        for(int i=1; i<n; i++) {

            if(arr[i] < 0 ) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(arr[i], arr[i] * maxEndingHere);
            minEndingHere = Math.min(arr[i], arr[i] * minEndingHere);

            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        System.out.println(maxProduct);
    }
}
