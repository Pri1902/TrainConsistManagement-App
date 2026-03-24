import java.util.*;

public class TrainConsistManagementApp {
    public static void main (String[] args) {

        HashSet<String> uniqueBogies = new HashSet<>();
        uniqueBogies.add("Engine");
        uniqueBogies.add("Sleeper");
        uniqueBogies.add("AC");
        uniqueBogies.add("Cargo");
        uniqueBogies.add("Guard");

        LinkedList<String> trainConsist = new LinkedList<>(uniqueBogies);
        trainConsist = new LinkedList<>(Arrays.asList("Engine", "Sleeper", "AC", "Cargo", "Guard"));

        System.out.println("Initial Train Consist : " + trainConsist);
        System.out.println(" ");

        trainConsist.add(2, "Pantry Car");
        System.out.println("Adding Pantry Car at position 2....");
        System.out.println("Train Consist : " + trainConsist);
        System.out.println(" ");

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After Removing First and Last Bogie....");
        System.out.println("Final Train Consist : " + trainConsist);
    }
}
