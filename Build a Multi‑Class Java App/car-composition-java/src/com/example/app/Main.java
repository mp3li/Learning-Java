package com.example.app;

import com.example.parts.*;
import com.example.exceptions.InvalidWheelException;

import java.util.Scanner;

public class Main {
    // Precondition: user provides inputs when prompted
    // Postcondition: outputs a summary of the car or a friendly error message
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter engine horsepower: ");
            int horsepower = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter engine type: ");
            String type = scanner.nextLine();

            Engine engine = new Engine(horsepower, type);

            System.out.print("How many wheels? ");
            int count = scanner.nextInt();
            if (count <= 0) {
                throw new IllegalArgumentException("Number of wheels must be positive.");
            }

            Wheel[] wheels = new Wheel[count];

            for (int i = 0; i < count; i++) {
                System.out.println("Wheel " + (i + 1) + " of " + count);

                System.out.print("Size: ");
                double size = scanner.nextDouble();

                System.out.print("Pressure: ");
                double pressure = scanner.nextDouble();

                wheels[i] = new Wheel(size, pressure);
            }

            scanner.nextLine();
            System.out.print("Driver name: ");
            String name = scanner.nextLine();

            System.out.print("Driver license number: ");
            String license = scanner.nextLine();

            Driver driver = new Driver(name, license);

            Car car = new Car(engine, wheels, driver);

            System.out.println("\nCar assembled successfully!");
            System.out.println("Engine: " + car.getEngine().getHorsepower() +
                    " HP, " + car.getEngine().getType());
            System.out.println("Driver: " + car.getDriver().getName());
            System.out.println("Number of wheels: " + car.getWheels().length);

        } catch (InvalidWheelException e) {
            System.out.println("Wheel error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input error: " + e.getMessage());
        }

        scanner.close();
    }
}
