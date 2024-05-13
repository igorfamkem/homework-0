package Car;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class Car {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Car() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    public Car(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public String addNewVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    public String[] listVehicleInformation() {
        try {
            return new String[]{make, model, color, Integer.toString(year), Integer.toString(mileage)};
        } catch (Exception e) {
            return new String[]{"Failed to list vehicle information: " + e.getMessage()};
        }
    }

    public void printVehicleInformation() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
        System.out.println("Car Mileage: " + mileage);
    }

    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }
}


