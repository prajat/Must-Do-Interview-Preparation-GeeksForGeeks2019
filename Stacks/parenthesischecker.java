

import java.util.*;

/**
 * parenthesischecker
 */
public class parenthesischecker {

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int t = s.nextInt();
        // while (t-- > 0) {
        //     String str = s.nextLine();
        //     System.out.println(checker(str));

        // }
        System.out.println(checker("(()"));
    }

    public static boolean checker(String str) {
        
        Stack<Character> stack = new Stack();
        char[] schar = s.toCharArray();
        for (int i = 0; i < schar.length; i++) {
            if (schar[i] == '(' || schar[i] == '[' || schar[i] == '{')
                stack.push(schar[i]);
            else if (schar[i] == ')' || schar[i] == ']' || schar[i] == '}') {
                if (stack.isEmpty())
                    return false;
                else {
                    char pop = stack.pop();
                    if (schar[i] == ')' && pop != '(')
                        return false;
                    else if (schar[i] == ']' && pop != '[')
                        return false;
                    else if (schar[i] == '}' && pop != '{')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}