class GfG {
    int minEle;
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    /* returns min element from stack */
    int getMin() {
        // Your code here
        if (min.empty()) {
            return -1;
        }
        return min.peek();
    }

    /* returns poped element from stack */
    int pop() {
        // Your code here
        if (s.empty())
            return -1;
        if (s.peek() == min.peek()) {
            min.pop();
        }
        return s.pop();
    }

    /* push element x into the stack */
    void push(int x) {
        // Your code here
        if (s.empty()) {
            s.push(x);
            min.push(x);
        } else {
            s.push(x);
            if (min.peek() >= x)
                min.push(x);
        }
    }
}