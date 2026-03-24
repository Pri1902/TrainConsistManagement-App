import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main (String[] args) {

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("B-101");
        bogieIDs.add("B-102");
        bogieIDs.add("B-103");
        bogieIDs.add("B-101");
        bogieIDs.add("B-102");

        System.out.println("Bogie IDs : " + bogieIDs);

        System.out.println("Note: Duplicates were automatically ignored by the HashSet.");
    }
}
