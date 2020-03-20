package org.fasttrackit;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Game game = new Game();
        game.start();

        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        String vehicleName = scanner.nextLine();
        System.out.println("Entered name: " + vehicleName);

        System.out.println();
        System.out.println( "Welcome to the racing game ");
        System.out.println();

        Car carReference = new Car();
        carReference.name = "Audi";
        carReference.colour = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;
        carReference.fuelLevel = 100;
        carReference.damaged = true;

//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        carReference.engine = engine1;
        double currentDistance = carReference.accelerate(60, 1);
        System.out.println("Current distance: " + currentDistance);
        //added mechanic
        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);
        System.out.println("Is car damaged? " + carReference.damaged);

        //One object with two references

        System.out.println();
        System.out.println("Engine details: ");
        System.out.println(engine1.manufacturer);
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);
        System.out.println();
        engine1.capacity = 2100;

        System.out.println("Updated engine details: ");
        System.out.println(engine1.manufacturer);
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);
        System.out.println();

        //concatanation
        System.out.println("Properties of " + carReference.name);
        System.out.println("Colour of car: " + carReference.colour);
        System.out.println("Maximum speed:  " + carReference.maxSpeed + " km/h");
        System.out.println("Mileage: " + carReference.mileage + " l/100 km");
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing Number: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);
        System.out.println();

//        Car car2 = new Car();
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
