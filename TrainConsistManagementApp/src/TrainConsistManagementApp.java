import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
    System.out.println("========================================");
        System.out.println("UC18 - Search Bogie ID (Linear Search)");
        System.out.println("========================================\n");

        Scanner sc = new Scanner(System.in);

        // Input: number of bogies
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Array of bogie IDs
        String[] bogieIDs = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Search key
        System.out.print("\nEnter bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < n; i++) {

            // Compare using equals()
            if (bogieIDs[i].equals(key)) {
                System.out.println("Bogie ID found at position: " + i);
                found = true;
                break; // Early termination
            }
        }

        // Result if not found
        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("\nSearch completed.");
        System.out.println("Program continues safely...");
    }
}
