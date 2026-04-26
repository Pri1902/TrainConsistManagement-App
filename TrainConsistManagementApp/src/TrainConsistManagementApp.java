import java.util.*;

public class TrainConsistManagementApp {
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop → number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop → compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // If left > right → swap
                if (capacities[j] > capacities[j + 1]) {

                    // Swapping logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Method to display array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    System.out.println("========================================");
        System.out.println("UC16 - Sort Passenger Bogie Capacities");
        System.out.println("========================================\n");

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();

        int[] capacities = new int[n];

        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        // Before sorting
        System.out.print("\nBefore Sorting: ");
        display(capacities);

        // Bubble Sort
        bubbleSort(capacities);

        // After sorting
        System.out.print("After Sorting: ");
        display(capacities);

        System.out.println("\nSorting completed using Bubble Sort.");
        System.out.println("Program continues safely...");
    }
}