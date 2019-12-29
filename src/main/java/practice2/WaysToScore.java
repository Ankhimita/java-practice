package practice2;

public class WaysToScore {

    public static void main(String[] args) {

        int n = 20;
        int[] arr = {3,5,10};
        int[] count = new int[n+1];

        count[0] = 1;

        for(int i=1; i<=n; i++){
            for(int j=0; j<=arr.length-1; j++) {
                if(i>=arr[j]) {
                    count[i]+= count[i-arr[j]];
                }
            }
        }

        System.out.println(count[n]);
    }
}
