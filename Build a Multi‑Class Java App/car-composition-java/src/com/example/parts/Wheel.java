package com.example.parts;

import com.example.exceptions.InvalidWheelException;

public class Wheel {
    private double size;
    private double pressure;

    // Precondition: size and pressure must be positive
    // Postcondition: wheel fields are set if valid
    public Wheel(double size, double pressure) throws InvalidWheelException {
        setSize(size);
        setPressure(pressure);
    }

    public double getSize() {
        return size;
    }

    // Precondition: size must be positive
    // Postcondition: size is updated if valid
    public void setSize(double size) throws InvalidWheelException {
        if (size <= 0) {
            throw new InvalidWheelException("Wheel size must be greater than 0.");
        }
        this.size = size;
    }

    // Precondition: none
    // Postcondition: returns the current pressure
    public double getPressure() {
        return pressure;
    }

    // Precondition: pressure must be positive
    // Postcondition: pressure is updated if valid
    public void setPressure(double pressure) throws InvalidWheelException {
        if (pressure <= 0) {
            throw new InvalidWheelException("Wheel pressure must be greater than 0.");
        }
        this.pressure = pressure;
    }
}
