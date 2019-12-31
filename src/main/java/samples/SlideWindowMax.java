package samples;


import java.util.Deque;
import java.util.LinkedList;

public class SlideWindowMax {
}

// Java Program to find the maximum for
// each and every contiguous subarray of size k.


class SlidingWindow {

    // A Dequeue (Double ended queue) based method for printing maximum element of
    // all subarrays of size k
    static void printMax(int arr[], int n, int k)
    {
        // Create a Double Ended Queue, Qi that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
        Deque<Integer> deque = new LinkedList<Integer>();

        /* Process first k (or first window) elements of array */
        int i;
        for (i = 0; i < k; ++i) {
            // For every element, the previous smaller elements are useless so
            // remove them from Qi
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.removeLast(); // Remove from rear

            // Add new element at rear of queue
            deque.addLast(i);
        }

        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for (; i < n; ++i) {
            // The element at the front of the queue is the largest element of
            // previous window, so print it
            System.out.print(arr[deque.peek()] + " ");

            // Remove the elements which are out of this window
            while ((!deque.isEmpty()) && deque.peek() <= i - k)
                deque.removeFirst();

            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while ((!deque.isEmpty()) && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();

            // Add current element at the rear of Qi
            deque.addLast(i);
        }

        // Print the maximum element of last window
        System.out.print(arr[deque.peek()]);
    }

    // Driver program to practice5 above functions
    public static void main(String[] args)
    {
        int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
// This code is contributed by Sumit Ghosh

