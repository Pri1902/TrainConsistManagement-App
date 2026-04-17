import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {
    public static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " - Capacity: " + capacity;
        }
    }


    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("First Class", 24),
                new Bogie("Cargo", 120),
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        // Step 2: Print all bogies
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Convert list to stream and filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 4: Print filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);
    }
}