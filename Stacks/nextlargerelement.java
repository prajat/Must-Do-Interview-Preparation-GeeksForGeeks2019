
package Stacks;

import java.util.*;

/**
 * nextlargerelement
 */
public class nextlargerelement {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            Long[] arr = new Long[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextLong();

            }
            ArrayList<Long> list = new ArrayList<>();
            Stack<Long> stack = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {

                while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add((long) -1);
                } else {
                    list.add(stack.peek());
                }

                stack.push(arr[i]);

            }
            Collections.reverse(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                System.out.println();
            }
        }
        s.close();

    }

}