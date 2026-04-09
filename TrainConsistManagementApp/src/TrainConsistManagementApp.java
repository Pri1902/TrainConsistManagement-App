import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main (String[] args) {

                HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

                bogieCapacityMap.put("First Class", 24);
                bogieCapacityMap.put("Cargo", 120);
                bogieCapacityMap.put("Sleeper", 72);
                bogieCapacityMap.put("AC Chair", 56);

                System.out.println("Bogie Capacity Details: ");

                for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }

                String searchKey = "Sleeper";
                if(bogieCapacityMap.containsKey(searchKey)) {
                    System.out.println("\nFast Lookup: The " + searchKey + " bogie has a capacity of " + bogieCapacityMap.get(searchKey) + ".");
                }
    }
}
