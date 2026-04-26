import java.util.*;

public class TrainConsistManagementApp {
    // Binary Search Method
    public static int binarySearch(String[] bogieIDs, String key) {

        int low = 0;
        int high = bogieIDs.length - 1;

        while (low <= high) {

            // Compute mid index
            int mid = (low + high) / 2;

            // Compare using compareTo()
            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0) {
                return mid; // Found
            } else if (result > 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
     System.out.println("========================================");
        System.out.println("UC19 - Search Bogie ID (Binary Search)");
        System.out.println("========================================\n");

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIDs = new String[n];

        // Input sorted IDs
        System.out.println("Enter bogie IDs (sorted):");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Optional safety: ensure sorted
        Arrays.sort(bogieIDs);

        // Search key
        System.out.print("\nEnter bogie ID to search: ");
        String key = sc.nextLine();

        // Perform binary search
        int index = binarySearch(bogieIDs, key);

        // Output result
        if (index != -1) {
            System.out.println("Bogie ID found at position: " + index);
        } else {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("\nBinary search completed.");
        System.out.println("Program continues safely...");
    }
}
