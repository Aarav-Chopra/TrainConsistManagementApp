import java.util.*;

// Train Consist Management App - UC2
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nPassenger Bogies after removal:");
        System.out.println(passengerBogies);

        // Check existence of "Sleeper"
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist in the train.");
        }

        // Final state of list
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        // Program continues...
    }
}