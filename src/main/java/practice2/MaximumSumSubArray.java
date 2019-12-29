package practice2;

public class MaximumSumSubArray {

    public static void main(String[] args) {

        int[] a =  {-2, -3, 4, -1, -2, 1, 5, -3 };

        int n = a.length;

        int maxEndingHere = 0;
        int maxSoFar = Integer.MIN_VALUE;
        int start=0, marker=0 , end = 0;

        for(int i=0; i<n; i++) {
            maxEndingHere = maxEndingHere + a[i];

            if(maxEndingHere> maxSoFar) {
                maxSoFar = maxEndingHere;
                start = marker;
                end = i;
            }

            if(maxEndingHere<0){
                maxEndingHere = 0;
                marker = i+1;
            }
        }

        System.out.println(maxSoFar);
        for(int i=start;i<=end;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
