import java.util.*;


/**
 * circulartour
 */
public class circulartour {
    int tour(int petrol[], int distance[]) {
        
        int deficit = 0;
        int start = 0;
        int available = 0;
        for (int i = 0; i < petrol.length; i++) {
            available += petrol[i] - distance[i];

            if (available < 0) {
                start = i + 1;
                deficit += available;
                available = 0;

            }
        }
        if (available + deficit > 0) {
            return start;
        }
        return -1;
    }

    
}