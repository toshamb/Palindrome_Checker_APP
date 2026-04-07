import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

        // UC7: Sort bogies by capacity using Comparator
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add passenger bogies with capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("\nPassenger bogies before sorting:");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // Sort by capacity using Comparator
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nPassenger bogies sorted by capacity:");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }
    }
}
