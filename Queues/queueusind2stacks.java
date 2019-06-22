package Queues;

import java.util.*;

class StackQueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void insert(int B) {

        s1.push(B);
    }

    int remove() {

        if (!s2.isEmpty()) {
            return s2.pop();
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            if (!s2.isEmpty()) {
                return s2.pop();
            }
        }
        return -1;

    }
}