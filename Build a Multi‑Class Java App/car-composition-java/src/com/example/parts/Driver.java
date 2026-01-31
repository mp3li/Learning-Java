package com.example.parts;

public class Driver {
    private String name;
    private String licenseNumber;

    // Precondition: name and license number must not be empty
    // Postcondition: driver fields are set if valid
    public Driver(String name, String licenseNumber) {
        setName(name);
        setLicenseNumber(licenseNumber);
    }

    // Precondition: none
    // Postcondition: returns the current driver name
    public String getName() {
        return name;
    }

    // Precondition: name must not be null or empty
    // Postcondition: name is updated if valid
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Driver name cannot be empty.");
        }
        this.name = name;
    }

    // Precondition: none
    // Postcondition: returns the current license number
    public String getLicenseNumber() {
        return licenseNumber;
    }

    // Precondition: license number must not be null or empty
    // Postcondition: license number is updated if valid
    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new IllegalArgumentException("Driver license number cannot be empty.");
        }
        this.licenseNumber = licenseNumber;
    }
}
