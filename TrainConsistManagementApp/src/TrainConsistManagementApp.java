import java.util.*;

public class TrainConsistManagementApp {
    public static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " - Cargo: " + cargo;
        }
    }
    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Grain"),
                new GoodsBogie("Flatbed", "Steel"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        // Step 2, 3, 4: Stream + allMatch + lambda rule
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule: If Cylindrical → only Petroleum allowed
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 5: Display result
        if (isSafe) {
            System.out.println("Train is SAFE");
        } else {
            System.out.println("Train is NOT SAFE ");
        }

    }
}