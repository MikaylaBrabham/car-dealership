package com.pluralsight;

import java.io.*;

public class DealershipFileManager {

//get dealership(): Dealership

    //add file name
    private static String File_Name = "inventory.csv";

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
                String[] vehicleInfo = line.split("||\");

                //parts of vehicle that need to be parsed by index refrenced from vehicles
                    //        return "Vehicle{" +
                    //                "vin=" + vin + " | " +
                    //                " | " + year +
                    //                " | " + make +
                    //                " | " + model +
                    //                " | " + vehicleType +
                    //                " | " + color +
                    //                " | " + odometer +
                    //                " | $" + price +
                    //                '}';
                    //    }


            }

            //add format for new vehicles






            //save dealership(dealership)


            //add logic for empty


            //add  auto generated catch exceptions (exception e)
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    //to string for reference while constructing dealership formatting
    //@Override
    //    public String toString() {
    //        return "Vehicle{" +
    //                "vin=" + vin + " | " +
    //                " | " + year +
    //                " | " + make +
    //                " | " + model +
    //                " | " + vehicleType +
    //                " | " + color +
    //                " | " + odometer +
    //                " | $" + price +
    //                '}';
    //    }

}
