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

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        //add array list to inventory
        this.inventory = new ArrayList<>();
    }

    //add getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }
}
