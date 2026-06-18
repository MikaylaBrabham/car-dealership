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
                    ProcessGetByPriceRequest();
                    break;
                case 2:
                    ProcessGetByMakeModelRequest();
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
                    ProcessGetByVehicleTypeRequest();
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
    private void ProcessGetByPriceRequest() {
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
    private void ProcessGetByMakeModelRequest() {

        // get make

        //get model

        //display results
    }

        //process year request

        //process color request

        //process mileage request

        //process type request

        //process add vehicle request
    }

    }


    //add user interface
  // UserInterface();


