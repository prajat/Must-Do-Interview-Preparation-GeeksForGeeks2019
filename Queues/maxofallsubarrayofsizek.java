package Queues;

import java.util.*;

/**
 * maxofallsubarrayofsizek
 */
public class maxofallsubarrayofsizek {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();

            }
            // int max = Integer.MIN_VALUE;
            // for (int i = 0; i < n - k + 1; i++) {
            // for (int j = i; j < i + k; j++) {
            // if (arr[i] > max) {
            // max = arr[i];
            // } o(n2) approach

            // }
            // System.out.print(max + " ");
            // max = Integer.MIN_VALUE;
            // }
            // System.out.println();

            int i;
            Deque<Integer> queue = new LinkedList<>();
            for (i = 0; i < k; ++i) {
                while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()])
                    ;
                {
                    queue.removeLast();
                }
                queue.addLast(i);
            }
            for (; i < n; i++) {
                System.out.print(arr[queue.peek()] + " ");

                while (!queue.isEmpty() && queue.peek() <= i - k) {
                    queue.removeFirst();

                }
                while (!queue.isEmpty() && arr[i] >= arr[queue.peekLast()])
                    ;
                {
                    queue.removeLast();
                }

                queue.addLast(i);
            }
            System.out.print(arr[queue.peek()]);
        }

    }
}