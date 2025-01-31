package circulartourproblem;

import static circulartourproblem.CircularTour.findStartingPoint;

public class Main {
    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        int startPoint = findStartingPoint(pumps);
        if (startPoint == -1) {
            System.out.println("Tour not possible");
        } else {
            System.out.println("Start the tour at pump index: " + startPoint);
        }
    }
}
