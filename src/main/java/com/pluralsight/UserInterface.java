package com.pluralsight;

import java.util.Scanner;

import static sun.tools.jconsole.OutputViewer.init;


public class UserInterface {


    //add my scanner
    Scanner myScanner = new Scanner(System.in);

    //add dealership
    private Dealership dealership;

    //add display menu to get vehicle choices
    public void display() {
        init();
        int choice = 0;

        //add intial menu
        while (choice != 99) {
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
            choice = myScanner.nextInt();
            myScanner.nextLine();

            //from their choice do logic in the switch

        }
    }


    //add user interface
   UserInterface();





}
