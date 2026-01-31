package com.example.parts;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private Driver driver;

    // Precondition: engine, wheels, and driver must not be null; wheels array must not be empty
    // Postcondition: car is fully assembled with valid parts
    public Car(Engine engine, Wheel[] wheels, Driver driver) {
        setEngine(engine);
        setWheels(wheels);
        setDriver(driver);
    }

    // Precondition: none
    // Postcondition: returns the current engine
    public Engine getEngine() {
        return engine;
    }

    // Precondition: none
    // Postcondition: returns the current wheels array
    public Wheel[] getWheels() {
        return wheels;
    }

    // Precondition: none
    // Postcondition: returns the current driver
    public Driver getDriver() {
        return driver;
    }

    // Precondition: engine must not be null
    // Postcondition: engine is updated
    public void setEngine(Engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null.");
        }
        this.engine = engine;
    }

    // Precondition: wheels must not be null and must contain at least one wheel
    // Postcondition: wheels are updated
    public void setWheels(Wheel[] wheels) {
        if (wheels == null || wheels.length == 0) {
            throw new IllegalArgumentException("Car must have at least one wheel.");
        }
        this.wheels = wheels;
    }

    // Precondition: driver must not be null
    // Postcondition: driver is updated
    public void setDriver(Driver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("Driver cannot be null.");
        }
        this.driver = driver;
    }
}
