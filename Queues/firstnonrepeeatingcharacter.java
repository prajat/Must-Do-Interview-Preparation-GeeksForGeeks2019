import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // BufferedReader br=null;
        try {
            int t;
            // br=new BufferedReader(new InputStreamReader(System.in));
            // t = Integer.parseInt(br.readLine());
            t = in.nextInt();
            while (t-- > 0) {
                int n = in.nextInt();
                char pop = 'a';
                Queue<Character> q = new LinkedList<>();
                HashMap<Character, Integer> map = new HashMap<Character, Integer>();

                for (int i = 0; i < n; i++) {
                    char c = in.next().charAt(0);
                    if (!map.containsKey(c)) {
                        map.put(c, 1);
                        q.add(c);
                        System.out.print(q.peek() + " ");
                    } else {
                        map.put(c, map.get(c) + 1);
                        while (!q.isEmpty() && map.get(q.peek()) > 1)
                            pop = q.remove();
                        if (q.isEmpty())
                            System.out.print("-1 ");
                        else
                            System.out.print(q.peek() + " ");

                    }

                }

                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}