package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership{
    //add variables
    private String name;
    private String address;
    private String phone;

    //add inventory extended by vehicle
    private ArrayList<Vehicle> inventory;

    //add constructors

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        //add array list to inventory
        this.inventory = new ArrayList<>();
    }

    //add getters

//name getter / setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //address get/ set
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    //phone get/set
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //get all vehicles
    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    //add vehicles
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

        // remove vehicles
    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }



    //add getVehicles by criteria in wkshp in the vehicle list

    //getvehiclesby price min and max
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        //get min/max of vehicle logic
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                matches.add(vehicle);
            }
        }
        return matches;
    }

    //get vehicles by make model
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        //add logic to get make and model
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make)
                && vehicle.getModel().equalsIgnoreCase(model))
            {matches.add(vehicle);}
    }
        return matches;
    }


    //get vehucles by year
    public List<Vehicle> getVehiclesByYear(Double min, Double max) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        //add logic to get year by min and mac
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                matches.add(vehicle);
            }
        }
        return matches;
    }


    //get vehicles by color
    public List<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matches.add(vehicle);
            }
        }
        return matches;
    }

    //get vehicles by mileage
    public List<Vehicle> getVehiclesByMileage(Double min, Double max) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        //add logic from get year and substitute
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                matches.add(vehicle);
            }
        }
        return matches;

    }

    //get vehicles by type
    public List<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        //add logic from color and substtute
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                matches.add(vehicle);
            }
        }
        return matches;
    }





}
