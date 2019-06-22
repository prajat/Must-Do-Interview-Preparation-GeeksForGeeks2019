import java.util.*;


//done by using only one queue
class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    

    
    int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.add(q1.poll());
        }
        return q1.poll();
    
    }

    
    void push(int a) {
        q1.add(a);
        
    }
}