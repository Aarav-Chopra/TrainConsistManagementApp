import java.util.*;

// Train Consist Management App - UC5
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display final formation
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Program continues...
    }
}