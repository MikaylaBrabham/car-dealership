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
            switch (theChoice) {
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

    //process price request logic
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

        // get vehicle type from the given car/truck/suv/van
        System.out.println("Vehicle Type(car / truck / suv / van): ");
        // name it
        String vehicleType = myScanner.nextLine().toLowerCase().trim();

        //create while statement to ensure correct use
        while (vehicleType.equalsIgnoreCase(" ")) {
            System.out.println("Please enter a vehicle type ( Car / Truck / Suv / Van ): ");
        }

        //display it
        displayVehicles(dealership.getVehiclesByType(vehicleType));
    }

    //process add vehicle request
    private void processAddVehicleRequest() {

        //prompt user for all parts of the vehicle
        System.out.println("Please enter all vehicles below as prompted!");

        //add vehicle by the different parts and prompt user
        // reference from the vehicles class
        //  + vin + " | " +
        //                " | " + year +
        //                " | " + make +
        //                " | " + model +
        //                " | " + vehicleType +
        //                " | " + color +
        //                " | " + odometer +
        //                " | $" + price +

        //prompt for vin and print
        System.out.println("Vin: ");
        Integer vin = myScanner.nextInt();

        //prompt for year and print
        System.out.println("Year: ");
        Integer year = myScanner.nextInt();

        //prompt for make and print
        System.out.println("Make: ");
        String make = myScanner.nextLine().trim().toLowerCase();

        //prompt for model and print
        System.out.println("Model: ");
        String model = myScanner.nextLine().trim().toLowerCase();

        //prompt for vehicle type and print
        System.out.println("Vehicle Type (Car, Truck, SUV, Van): ");
        String vehicleType = myScanner.nextLine().trim().toLowerCase();

        //prompt for color and print
        System.out.println("Color: ");
        String color = myScanner.nextLine().toLowerCase().trim();

        //prompt for odometer and print
        System.out.println("Odometer: ");
        Integer odometer = myScanner.nextInt();

        //prompt for price and print
        System.out.println("Price: $");
        Double price = myScanner.nextDouble();


        // create new  vehicle object
        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
        dealership.addVehicle(vehicle);

        //add it to the file manager and save it
        DealershipFileManager fileManager = new DealershipFileManager();
        fileManager.saveDealership(dealership);

        //print success statement
        System.out.println("Your vehicle was successfully created and added to the system!");

    }

    //process remove vehicle
    private void processRemoveVehicleRequest() {

        //prompt user to remove car
        System.out.println("You have selected the removal option, please enter your car details below.");

        // prompt user to remove by vin #
        System.out.println("Vehicle Vin: ");
        Integer vehicleVin = myScanner.nextInt();
        myScanner.nextLine();

        //add vehicle to removal list and make it empty
        Vehicle vehicleRemoval = equals(" ");

        //add logic to ensure removes everything
        for (Vehicle vehicle : dealership.getAllVehicles()) {
            if (vehicle.getVin() == vehicleVin) {
                vehicleRemoval = vehicle;
                System.out.println("Your vehicle has been found.");
            }
        }
        //logic for vehicle not found
        if (vehicleRemoval.equals(" ")) {
            System.out.println("Vehicle not found.");
        }
        //add logic for if vehicle found remove and update filemanager
        else {
            dealership.removeVehicle(vehicleRemoval);
            //added and updated file manager
            DealershipFileManager fileManager = new DealershipFileManager();
            fileManager.saveDealership(dealership);
            //print vehicle removal success statement
            System.out.println("Your vehicle has been successfully removed!");
        }
    }
}


    //add user interface
  // UserInterface();


