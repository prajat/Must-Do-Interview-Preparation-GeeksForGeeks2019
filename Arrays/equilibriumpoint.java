package Arrays;

import java.util.*;
/**
 * equilibriumpoint
 */
public class equilibriumpoint {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }

            int flag = 0;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            int leftsum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum - arr[i];
                if (leftsum == sum) {
                    System.out.println(i + 1);
                    flag = 1;
                    break;
                }
                leftsum += arr[i];
            }
            if (flag == 0) {
                System.out.println(-1);
            }

            
        }
    }
}