
---

# VehicleTracker Program

## Overview

The `VehicleTracker` program is a simple Java application that manages and displays a list of vehicles. It demonstrates basic operations on an `ArrayList`, such as adding, removing, and updating elements. The program is designed to showcase fundamental Java concepts and provides a clear example of working with collections in Java.

## Features

- **Vehicle List Management**: Initializes a list of vehicles and performs operations such as inserting and updating elements.
- **Dynamic List Update**: Demonstrates how to modify the list by inserting a new vehicle before a specified item and replacing an existing vehicle.
- **Console Output**: Provides clear and formatted output to the console, showing the list before and after updates.

## Code Functionality

Here’s a detailed breakdown of the code:

### 1. Initialization and Setup

```java
import java.util.ArrayList;

public class VehicleTracker {

    public static void main(String[] args) {
```

- **Imports**: The `ArrayList` class from `java.util` is imported to use the ArrayList collection.
- **Main Method**: The `main` method is the entry point of the program.

### 2. Creating and Populating the Vehicle List

```java
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
```

- **ArrayList Creation**: An `ArrayList` named `cars` is created to hold vehicle names.
- **Adding Vehicles**: Vehicles are added to the list using the `add` method.

### 3. Displaying the Initial List

```java
        // Print report title
        System.out.println("*** List of Cars ***");

        // Iterate over the ArrayList using a loop
        for (int i = 0; i < cars.size(); i++) {
            // Print each car
            System.out.println(cars.get(i));
        }
```

- **Report Title**: Prints a title indicating the start of the list.
- **Iteration**: Uses a traditional for-loop to iterate over the list and print each vehicle.

### 4. Modifying the List

```java
        // Insert "Tacoma" before "Lincoln"
        cars.add(cars.indexOf("Lincoln"), "Tacoma");

        // Replace "Ram 2500" with "F250 Super Duty"
        cars.set(cars.indexOf("Ram 2500"), "F250 Super Duty");
```

- **Insert Operation**: Inserts `"Tacoma"` before `"Lincoln"` using `indexOf` and `add`.
- **Replace Operation**: Replaces `"Ram 2500"` with `"F250 Super Duty"` using `set`.

### 5. Displaying the Updated List

```java
        // Print report title after update
        System.out.println("\n*** Cars after Update ***");

        // Iterate over the ArrayList using the Enhanced for loop
        for (String car : cars) {
            // Print each car
            System.out.println(car);
        }
    }
}
```

- **Updated Report Title**: Prints a title indicating the list has been updated.
- **Enhanced For-Loop**: Uses the enhanced for-loop to iterate over and print the updated list of vehicles.

## Usage

1. **Compile the Program**:
   ```bash
   javac VehicleTracker.java
   ```

2. **Run the Program**:
   ```bash
   java VehicleTracker
   ```

## Output

When you run the program, you will see the following output:

```
*** List of Cars ***
Mercedes
Mustang GT
Odyssey
Porsche
Corvette
Lincoln
Xterra
Camry
Silverado
Ram 2500

*** Cars after Update ***
Mercedes
Mustang GT
Odyssey
Porsche
Corvette
Tacoma
Xterra
Camry
Silverado
F250 Super Duty
```

## Conclusion

The `VehicleTracker` program serves as a basic example of how to manage a list of objects in Java using an `ArrayList`. It illustrates common operations such as adding, updating, and displaying list elements.

---
