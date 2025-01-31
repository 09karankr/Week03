package circulartourproblem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps){
        int n = pumps.length;
        int start = 0;
        int surplus = 0;
        int deficit = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;

            // Add pump index to the queue
            queue.add(i);

            // If surplus is negative, reset the start point
            if (surplus < 0) {
                deficit += surplus;  // Maintain the deficit
                start = i + 1;        // Update start position
                surplus = 0;         // Reset surplus
                queue.clear();       // Clear the queue for the next possible solution
            }
        }

        // Return the starting point or -1 if tour is not possible
        return (surplus + deficit >= 0) ? start : -1;
    }
}
