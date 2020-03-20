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
        if (fuelLevel <= 0){
            System.out.println("Not enough fuel!!!");
            return 0;
        }

        if (speed > maxSpeed) {
            System.out.println("Maxs peed excedeed!!!");
            return 0; }
        else if (speed == maxSpeed){
            System.out.println("Be carefull max speed achieved!!"); }
        else {
            System.out.println("Valid speed entered!");
        }
//TODO use more fuel if speed > 120
        double mileageMultiplier = 1;
        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }

        System.out.println();
        System.out.println(name + " is accelarating with " + speed + " km/h for " + durationInHours + " h" );
        //local variable
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance);

       totalDistance +=traveledDistance;
        System.out.println("Total traveled distance: " + totalDistance);

        double usedFuel = traveledDistance * mileage / 100;
        usedFuel *= mileageMultiplier;
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
