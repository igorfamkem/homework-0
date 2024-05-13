package Car;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("Toyota", "Camry", "Red", 2020, 15000);

        System.out.println("Listing initial vehicle:");
        car.printVehicleInformation();

        System.out.println(car.removeVehicle());

        System.out.println(car.addNewVehicle("Honda", "Civic", "Blue", 2022, 5000));

        System.out.println("Listing new vehicle:");
        car.printVehicleInformation();

        System.out.println(car.updateVehicleAttributes("Honda", "Civic", "Green", 2022, 5000));

        System.out.println("Updated vehicle information:");
        car.printVehicleInformation();

        System.out.println("Do you want to print this information to a file? (Y/N)");
        String response = scanner.next();
        if ("Y".equalsIgnoreCase(response)) {
            writeToFile(car.listVehicleInformation());
            System.out.println("Information printed to C:\\Temp\\Autos.txt");
        } else {
            System.out.println("File will not be printed.");
        }

        scanner.close();
    }

    private static void writeToFile(String[] data) {
        try (FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt")) {
            for (String line : data) {
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Failed to write to file: " + e.getMessage());
        }
    }
}