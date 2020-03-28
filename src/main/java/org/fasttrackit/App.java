package org.fasttrackit;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
//        Game game = new Game();
//        game.start();
// method implementation taken from object's class, not from variable's class
        Vehicle cheater = new CheatingVehicle();
        cheater.setName("Cheater");

        cheater.accelerate(60, 1);
        System.out.println("Total distance: "+ cheater.getTotalDistance());

        //variable type decided what methods can be invoked
        // type casting
        ((CheatingVehicle)cheater).fly();

        Vehicle vehicle1 = new Vehicle();
//        vehicle1.totalVehicleCount = 1;
        Vehicle vehicle2 = new Vehicle();
//        vehicle2.totalVehicleCount = 2;
//        Vehicle.totalVehicleCount =50;

//        System.out.println("Total count from vehicle1: " + vehicle1.totalVehicleCount);
//        System.out.println("Total count from vehicle2: " + vehicle2.totalVehicleCount);
//        System.out.println("Total count from Vehicle: " + Vehicle.getTotalVehicleCount());

//        System.out.println("Please enter vehicle name: ");
//        Scanner scanner = new Scanner(System.in);
//        String vehicleName = scanner.nextLine();
//        System.out.println("Entered name: " + vehicleName);
//
//        System.out.println();
//        System.out.println( "Welcome to the racing game ");
//        System.out.println();
//
        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        Car carReference = new Car(engine1);
        carReference.setName("Audi");
        carReference.setColour("Red");
        carReference.setMaxSpeed(260);
        carReference.setMileage(6.2);
        carReference.setFuelLevel(100);
        carReference.setDamaged(true);

        System.out.println(carReference);
//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;



        double currentDistance = carReference.accelerate(60, 1);
        System.out.println("Current distance: " + currentDistance);
        //added mechanic
        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);
        System.out.println("Is car damaged? " + carReference.isDamaged());

//        //One object with two references
//
//        System.out.println();
//        System.out.println("Engine details: ");
//        System.out.println(engine1.manufacturer);
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//        System.out.println();
//        engine1.capacity = 2100;
//
//        System.out.println("Updated engine details: ");
//        System.out.println(engine1.manufacturer);
//        System.out.println(engine1.capacity);
//        System.out.println(carReference.engine.capacity);
//        System.out.println();
//
//        //concatanation
        System.out.println("Properties of " + carReference.getName());
        System.out.println("Colour of car: " + carReference.getColour());
        System.out.println("Maximum speed:  " + carReference.getMaxSpeed() + " km/h");
//        System.out.println("Mileage: " + carReference.mileage + " l/100 km");
//        System.out.println("Fuel level: " + carReference.fuelLevel);
//        System.out.println("Racing Number: " + carReference.racingNumber);
//        System.out.println("Damaged: " + carReference.damaged);
//        System.out.println();
//
//        Car car2 = new Car(new Engine());
//        car2.name = "Lamboughini";
//        car2.damaged = true;
//        car2.colour = "Blue";

//        System.out.println("Proprieties of: " + car2.name);
//        System.out.println("Colour of car: " + car2.colour);
//        System.out.println("Damaged: " + car2.damaged);

        //modulo modulus operator
//        System.out.println(4 % 2);
//        System.out.println(4 % 2 == 0);
//        System.out.println(4 % 3);

    }
}