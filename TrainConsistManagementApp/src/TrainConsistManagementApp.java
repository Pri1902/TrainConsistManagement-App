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

        public String getType() {
            return type;
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

        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("Grouped Bogies:");
        groupedBogies.forEach((type, list) -> {
            System.out.println("\nType: " + type);
            list.forEach(System.out::println);
        });
    }
}