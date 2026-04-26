//import java.util.*;

public class TrainConsistManagementApp {
    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Enum for cargo types
    enum CargoType {
        COAL, GRAINS, PETROLEUM
    }

    // Abstract Bogie class
    static abstract class GoodsBogie {
        String shape;
        CargoType cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(CargoType cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") && cargo == CargoType.PETROLEUM) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo validation completed for " + shape + " bogie\n");
            }
        }
    }

    // Rectangular Bogie
    static class RectangularBogie extends GoodsBogie {
        public RectangularBogie() {
            super("Rectangular");
        }
    }

    // Cylindrical Bogie
    static class CylindricalBogie extends GoodsBogie {
        public CylindricalBogie() {
            super("Cylindrical");
        }
    }

    public static void main(String[] args) {
    System.out.println("========================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("========================================\n");

        GoodsBogie cylindrical = new CylindricalBogie();
        GoodsBogie rectangular = new RectangularBogie();

        // Valid case
        cylindrical.assignCargo(CargoType.PETROLEUM);

        // Invalid case
        rectangular.assignCargo(CargoType.PETROLEUM);

        System.out.println("UC15 runtime handling completed...");

    }
}