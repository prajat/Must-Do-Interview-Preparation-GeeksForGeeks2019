package Arrays;

import java.util.*;
public class missinnoinarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n - 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();

            }
            int totalsum = (n * (n + 1)) / 2;
            int currsum = 0;
            for (int i = 0; i < arr.length; i++) {
                currsum += arr[i];
            }
            System.out.println(totalsum-currsum);

        }
        
    }
}