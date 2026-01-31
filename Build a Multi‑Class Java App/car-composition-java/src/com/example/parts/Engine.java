package com.example.parts;

import com.example.exceptions.InvalidEngineException;

public class Engine {
    private int horsepower;
    private String type;

    // Precondition: horsepower must be positive, type must not be empty
    // Postcondition: engine fields are set if valid
    public Engine(int horsepower, String type) {
        setHorsepower(horsepower);
        setType(type);
    }

    public int getHorsepower() {
        return horsepower;
    }

    // Precondition: horsepower must be positive
    // Postcondition: horsepower is updated if valid
    public void setHorsepower(int horsepower) {
        if (horsepower <= 0) {
            throw new InvalidEngineException("Horsepower must be positive.");
        }
        this.horsepower = horsepower;
    }

    // Precondition: none
    // Postcondition: returns the current engine type
    public String getType() {
        return type;
    }

    // Precondition: type must not be null or empty
    // Postcondition: type is updated if valid
    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            throw new InvalidEngineException("Engine type cannot be empty.");
        }
        this.type = type;
    }
}
