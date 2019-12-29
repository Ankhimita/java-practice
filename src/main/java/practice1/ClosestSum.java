package practice1;

//Question1

class SolutionPair {
    int i;
    int j;

    SolutionPair() {

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}


public class ClosestSum {

    public static void main(String[] args) {

        int[] a1 = new int[]{12, 13, 11, -45, 5, -70};
        int[] a2 = new int[]{-4, 27, -42, 16, 15, -81};


        findClosestSumToZeroElements(a1, a2);

    }

    private static void findClosestSumToZeroElements(int[] a1, int[] a2) {
        int valueSoFar = Integer.MAX_VALUE;
        int minEndingHere = 0;

        SolutionPair pair = new SolutionPair();

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                minEndingHere = a1[i] + a2[j];
                if (minEndingHere > 0 && minEndingHere < valueSoFar) {
                    valueSoFar = minEndingHere;
                    pair.setI(a1[i]);
                    pair.setJ(a2[j]);
                }
            }
        }

        if(pair.getI()!=0 && pair.getJ()!=0){
            System.out.println("Element from array1 is " + pair.getI());
            System.out.println("Element from array2 is " + pair.getJ());
        }
    }
}
