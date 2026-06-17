package com.pluralsight;

import java.io.*;

public class DealershipFileManager {

//get dealership(): Dealership

    //add file name
    private static String File_Name = "inventory.csv";


    //save dealership(dealership)
    public Dealership getDealership() {
        Dealership dealership = null;

        //add try to add reader
        try (BufferedReader myReader = new BufferedReader(new FileReader(File_Name))) {

            //parse data by pipes using indexes
            String line = myReader.readLine();

            //add the formatting for new vehicles

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
