import java.util.*;

public class TrainConsistManagementApp {
    // Binary Search Method
    // Method to search bogie ID (Linear Search for simplicity)
    public static void searchBogie(List<String> bogieList, String key) {

        // Defensive check (Fail-Fast)
        if (bogieList.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Search logic (only runs if list is NOT empty)
        boolean found = false;

        for (int i = 0; i < bogieList.size(); i++) {
            if (bogieList.get(i).equals(key)) {
                System.out.println("Bogie ID found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found.");
        }
    }

    public static void main(String[] args) {
      System.out.println("========================================");
        System.out.println("UC20 - Fail-Fast Search Validation");
        System.out.println("========================================\n");

        Scanner sc = new Scanner(System.in);

        // Empty bogie collection
        List<String> bogieList = new ArrayList<>();

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // Attempt search on empty list
            searchBogie(bogieList, key);

        } catch (IllegalStateException e) {
            // Handle runtime exception gracefully
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}
