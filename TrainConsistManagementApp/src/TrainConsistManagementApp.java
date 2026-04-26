import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
     System.out.println("========================================");
        System.out.println("UC17 - Sort Bogie Type Names");
        System.out.println("========================================\n");

        // Array of bogie types
        String[] bogieTypes = {
            "First Class",
            "Sleeper",
            "AC Chair",
            "General",
            "Luxury"
        };

        // Before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // Using built-in sort
        Arrays.sort(bogieTypes);

        // After sorting
        System.out.println("\nAfter Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));

    }
}
