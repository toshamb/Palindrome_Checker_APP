import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " → " + capacity;
    }
}

public class trainconsistentmanagementapp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC8: Filter passenger bogies using Streams
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("\nPassenger bogies before filtering:");
        passengerBogies.forEach(System.out::println);

        // Filter bogies with capacity greater than 60
        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nPassenger bogies with capacity > 60:");
        highCapacityBogies.forEach(System.out::println);

        // Original list remains unchanged
        System.out.println("\nOriginal passenger bogie list (unchanged):");
        passengerBogies.forEach(System.out::println);
    }
}
