package practice2;

public class DuplicateNumbers {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,1,2,3,6,3,6};
        int n= arr.length;

        for(int i=0; i<n;i++) {
            int indexElement = Math.abs(arr[i]);
            if(arr[indexElement]<0) {
                System.out.println(indexElement+ " ");
            }
                arr[indexElement]= (-1) * arr[indexElement];

        }

    }
}
