import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistManagementApp {

    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() { return name; }
        public int getCapacity() { return capacity; }

        @Override
        public String toString() {
            return String.format("%-12s ->  %d", name, capacity);
        }
    }

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Cargo", 120));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("Before Sorting: ");
        bogies.forEach(System.out::println);

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting: ");
        bogies.forEach(System.out::println);
    }
}