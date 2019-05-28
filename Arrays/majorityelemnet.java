package Arrays;

import java.util.*;
/**
 * majorityelemnet
 */
public class majorityelemnet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();

            }
            int cand = candidate(arr);
            if (ismajority(arr, cand) == true) {
                System.out.println(cand);
            }
            else {
                System.out.println(-1);
            }

        }
    }

    public static int candidate(int[] arr) 
    {
        int majindex = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[majindex] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                majindex = i;
                count = 1;
            }
        }
        return arr[majindex];

    }

    public static boolean ismajority(int[] arr, int cand) {
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cand) {
                count++;
            }
        }
        if (count >arr.length / 2) {
            return true;
        }
        return false;
        
    }
}