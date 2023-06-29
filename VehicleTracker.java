import java.util.ArrayList;

public class VehicleTracker {

    public static void main(String[] args) {

        // Create an ArrayList to store the vehicles
        ArrayList<String> cars = new ArrayList<>();

        // Add vehicles to the list
        cars.add("Mercedes");
        cars.add("Mustang GT");
        cars.add("Odyssey");
        cars.add("Porsche");
        cars.add("Corvette");
        cars.add("Lincoln");
        cars.add("Xterra");
        cars.add("Camry");
        cars.add("Silverado");
        cars.add("Ram 2500");

        // Print report title
        System.out.println("*** List of Cars ***");

        // Iterate over the ArrayList using a loop
        for (int i = 0; i < cars.size(); i++) {
            // Print each car
            System.out.println(cars.get(i));
        }

        // Insert "Tacoma" before "Lincoln"
        cars.add(cars.indexOf("Lincoln"), "Tacoma");

        // Replace "Ram 2500" with "F250 Super Duty"
        cars.set(cars.indexOf("Ram 2500"), "F250 Super Duty");

        // Print report title after update
        System.out.println("\n*** Cars after Update ***");

        // Iterate over the ArrayList using the Enhanced for loop
        for (String car : cars) {
            // Print each car
            System.out.println(car);
        }
    }
}
