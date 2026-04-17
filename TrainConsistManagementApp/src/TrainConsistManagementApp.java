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
    }


    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("First Class", 24),
                new Bogie("Cargo", 120),
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}