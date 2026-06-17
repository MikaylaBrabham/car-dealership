package com.pluralsight;

public class Vehicle {

    //add arguments to hold info about a specific website
    private Integer vin;
    private Integer year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private Integer odometer;
    private Double price;

    //add constructor

    public Vehicle(Integer vin, Integer year, String make, String model, String vehicleType, String color, Integer odometer, Double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }


    //added getters and setters


}
