package com.learnjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// create factory that will create the vehicle
        VehicleFactory factory = new VehicleFactory();

        //take input
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of vehicle");

        String VehicleName = scn.nextLine();

        Vehicle vehicle = factory.getVehicle(VehicleName);
        vehicle.VehicleInfo();
    }
}
