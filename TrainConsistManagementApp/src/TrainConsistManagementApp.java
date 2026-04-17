import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {
    public static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    public static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than 0");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> train = new ArrayList<>();

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            train.add(b1);


            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            train.add(b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nTrain Consist:");
        train.forEach(System.out::println);

    }
}