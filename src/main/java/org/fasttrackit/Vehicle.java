package org.fasttrackit;

public class Vehicle {
    //instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String colour;
    double fuelLevel;
    double totalDistance;
    boolean damaged;


    public double accelerate (double speed, double durationInHours) {
        System.out.println();
        System.out.println(name + " is accelarating with " + speed + " km/h for " + durationInHours + " h" );
        //local variable
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance);

       totalDistance +=traveledDistance;
        System.out.println("Total traveled distance: " + totalDistance);

        double usedFuel = traveledDistance * mileage / 100;
        fuelLevel = fuelLevel - usedFuel;
//        same result as instruction above
//        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);
        System.out.println();
        return traveledDistance;}
    public void decelarate()
    //TODO: implement this
    {
        System.out.println("This is just a demo method");
    }
}
