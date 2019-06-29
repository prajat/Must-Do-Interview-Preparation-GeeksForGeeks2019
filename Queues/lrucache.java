import java.util.*;

package Queues;

/**
 * lrucache
 */
public class lrucache {
    Map<Integer, Integer> map;
    int capacity;
    Queue<Integer> queue;

    /* Inititalize an LRU cache with size N */
    public LRUCache(int N) {
       //Your code here
       map=new LinkedHashMap<Integer,Integer>();
       queue=new LinkedList<>();
       capacity=N;
       
       
    }

    /*
     * Returns the value of the key x if present else returns -1
     */
    public int get(int x) {
        // Your code here
        if (map.containsKey(x)) {
            int ans = map.get(x);
            queue.remove(x);
            queue.add(x);
            return ans;
        }
        return -1;

    }

    /* Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {


        if (map.containsKey(x)) {
            map.put(x, y);
            queue.remove(x);
            queue.add(x);
        }
        if (!map.containsKey(x)) {
            if (queue.size() == capacity) {
                int key = queue.poll();
                map.remove(key);
                queue.add(x);
                map.put(x, y);
                
            }
           

        }
        else{
            map.put(x, y);
            queue.add(x);
        }
       
        

    }

}