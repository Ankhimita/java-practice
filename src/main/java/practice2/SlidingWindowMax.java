package practice2;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {

    static void findMax(int[] arr, int k) {

        int n = arr.length;

        Deque<Integer> maxDeque = new LinkedList<>();

        int i;
        for(i=0; i<k; ++i) {
            while(!maxDeque.isEmpty() && arr[i]>=arr[maxDeque.peekLast()]) {
                maxDeque.removeLast();
            }
            maxDeque.addLast(i);
        }

        for(; i<n;++i) {
            System.out.println(arr[maxDeque.peek()]);

            while(!maxDeque.isEmpty() && maxDeque.peek()<=i-k) {
                maxDeque.removeFirst();
            }
            while(!maxDeque.isEmpty() && arr[i]>=arr[maxDeque.peekLast()]) {
                maxDeque.removeLast();
            }
            maxDeque.addLast(i);
        }

        System.out.println(arr[maxDeque.peekFirst()]);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 1, 78, 90, 57, 89, 56 };
        int k = 3;
        findMax(arr,k);
    }
}
