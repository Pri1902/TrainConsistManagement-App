import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main (String[] args) {

        List<String> trainConsist = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // 3. Print the list after insertion
        System.out.println("After Adding Bogies :");
        System.out.println("Passenger Bogies : " + trainConsist);
        System.out.println("  ");

        // 4. Remove one bogie (AC Chair)
        trainConsist.remove("AC Chair");
        System.out.println("After removing AC Chair :");
        System.out.println("Passenger Bogies : " + trainConsist);
        System.out.println(" " );

        // 5. Use contains() to check if Sleeper exists
        boolean hasSleeper = trainConsist.contains("Sleeper");
        System.out.println("Checking if Sleeper exists :");
        System.out.println("Contains Sleeper ? : " + hasSleeper);
        System.out.println(" ");

        // 6. Print final list state
        System.out.println("Final Train Passenger Consist: " + trainConsist);
    }
}
