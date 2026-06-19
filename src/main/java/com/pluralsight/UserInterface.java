package com.pluralsight;

import java.util.List;
import java.util.Scanner;

import static sun.tools.jconsole.OutputViewer.init;


public class UserInterface {


    //add my scanner
    Scanner myScanner = new Scanner(System.in);

    //add dealership
    private Dealership dealership;

    //add init method to call the dealership
    public void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }



    //add display menu to get vehicle choices
    public void display() {
        init();
        int theChoice = 0;

        //add initial menu
        while (theChoice != 99) {
            System.out.println("*~~~~~~~  Welcome To  ~~~~~~~~~~~~~~~~~*\n");
            System.out.println(dealership.getName());
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*\n");
            System.out.println("1 - Find Vehicles By Price <3");
            System.out.println("2 - Find Vehicles By Make/Model <3");
            System.out.println("3 - Find Vehicles By Year <3");
            System.out.println("4 - Find Vehicles By Color <3");
            System.out.println("5 - Find Vehicles By Mileage <3");
            System.out.println("6 - Find Vehicles By Type <3");
            System.out.println("7 - All Vehicles <3");
            System.out.println("8 - Add A Vehicle <3");
            System.out.println("9 - Remove A Vehicle <3");
            System.out.println("0 - End Service <3");
            System.out.println("Please Make Your Selection: ");

            //get users choice
            theChoice = myScanner.nextInt();
            myScanner.nextLine();

            //from their choice do logic in the switch
            //add process statements from the visual in workbook
            switch (theChoice){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Thank You Valued Member, Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Selection Entered.");
                    break;

                }
            }
        }
        //add a private displayvehicles() helper method - logic for the switch
    private void displayVehicles(List<Vehicle> vehicles) {

        //if the vehicles are empty return null, if not print
        if (vehicles.isEmpty()) {
            System.out.println("There are no vehicles found!");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
        //process all vehicles logic
    private void processGetAllVehiclesRequest() {
        displayVehicles(dealership.getAllVehicles());
    }

        //proccess price request logic
    private void processGetByPriceRequest() {
        //minimum price
        System.out.println("Minimum Price: $");
        double min = myScanner.nextDouble();

        //maximum price
        System.out.println(("Maximum Price: $"));
        double max = myScanner.nextDouble();
        myScanner.nextLine();

        //display results
        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

        //process make model request
    private void processGetByMakeModelRequest() {

        // get make
        System.out.println("The Vehicles Make: ");
        String make = myScanner.nextLine().trim().toLowerCase();

        //get model
        System.out.println("The Vehicles Model: ");
        String model = myScanner.nextLine().trim().toLowerCase();

        //display results
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }

        //process year request
    private void processGetByYearRequest() {
        // get the min year
        System.out.println("Minimum Year: ");
        Double min = myScanner.nextDouble();

        //get the max year
        System.out.println("Maximum Year: ");
        Double max = myScanner.nextDouble();

        //display all the results
        displayVehicles(dealership.getVehiclesByYear(min, max));
    }

        //process color request
    private void processGetByColorRequest() {
//get the color
        System.out.println("Color: ");
        String color = myScanner.nextLine().trim().toLowerCase();

        //display results
        displayVehicles(dealership.getVehiclesByColor(color));
    }

        //process mileage request
        private void processGetByMileageRequest() {
        // rename it mileage
        // get the odometer reading min / max
            System.out.println("Minimum Odometer Reading: ");
            Double minimumMileage = myScanner.nextDouble();

            System.out.println("Maximum Odometer Reading: ");
            Double maximumMileage = myScanner.nextDouble();

            //display
            displayVehicles(dealership.getVehiclesByMileage(minimumMileage, maximumMileage));
        }

        //process type request
    private void processGetByVehicleTypeRequest() {

        // get vehicle type fromt he given car/truck/suv/van
        // name it
        //display it
    }

        //process add vehicle request
    private void processAddVehicleRequest() {

        //prompt user for all parts of the vehicle

        // create new object

        //add it to the file manager and save it

        //print success statement

    }
    //process remove vehicle

    //prompt user for al

    }


    //add user interface
  // UserInterface();


