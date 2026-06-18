package com.pluralsight;

import java.io.*;

public class DealershipFileManager {

//get dealership(): Dealership

    //add file name
    private final static String File_Name = "inventory.csv";

    //empty dealership
    public Dealership getDealership() {
        Dealership dealership = null;

        //add try to add reader
        try (BufferedReader myReader = new BufferedReader(new FileReader(File_Name))) {

            //parse data by pipes using indexes
            String line = myReader.readLine();

            //add the formatting for new vehicles
            String[] dealershipInfo = line.split("\\|");

            //parse line one with dealership info by indexes , name / address/ phone #
            String name = dealershipInfo[0];
            String address = dealershipInfo[1];
            String phone = dealershipInfo[2];

            //add line one formatting for new dealership
            dealership = new Dealership(name, address, phone);


            // add logic in while loop so vehicle info can be parsed line by line split by pipes
            while ((line = myReader.readLine()) != null) {
                String[] vehicleInfo = line.split("\\|");

                //parts of vehicle that need to be parsed by index refrenced from vehicles
                Integer vin = Integer.parseInt(vehicleInfo[0]);
                Integer year = Integer.parseInt(vehicleInfo[1]);
                String make = vehicleInfo[2];
                String model = vehicleInfo[3];
                String vehicleType = vehicleInfo[4];
                String color = vehicleInfo[5];
                Integer odometer = Integer.parseInt(vehicleInfo[6]);
                Double price = Double.parseDouble(vehicleInfo[7]);


                //add format for new vehicles
                Vehicle vehicle = new Vehicle(
                        vin,
                        year,
                        make,
                        model,
                        vehicleType,
                        color,
                        odometer,
                        price
                );

                //add statement so dealership can be added
                dealership.addVehicle(vehicle);
            }
            //add  auto generated catch exceptions (exception e)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }


    //save dealership(dealership)
    public void saveDealership(Dealership dealership) {
        //add logic for empty try to insert writer
        try (PrintWriter myWriter = new PrintWriter(new FileWriter(File_Name))) {

            // writer line one dealership info
            myWriter.println(dealership.getName() +
                    "|" + dealership.getAddress() +
                    "|" + dealership.getPhone());


            //write line two vehicle info
            for (Vehicle vehicle : dealership.getAllVehicles()) {
                myWriter.println(
                        vehicle.getVin() + "|" +
                                vehicle.getYear() + "|" +
                                vehicle.getMake() + "|" +
                                vehicle.getModel() + "|" +
                                vehicle.getVehicleType() + "|" +
                                vehicle.getColor() + "|" +
                                vehicle.getOdometer() + "|" +
                                vehicle.getPrice());

            }

            //add generated exceptions
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
