package Arrays;

import java.util.*;

/**
 * leadersinarray
 */
public class leadersinarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();

            }

            ArrayList<Integer> list = new ArrayList<>();
            int curmax = arr[arr.length - 1];
            list.add(curmax);
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] >= curmax) {
                    curmax = arr[i];
                    list.add(curmax);
                }
            }

            StringBuffer sb = new StringBuffer();

            for (int i = list.size() - 1; i >= 0; i--) {
                sb.append(list.get(i) + " ");
            }
            System.out.println(sb.toString());
        }
    }
}