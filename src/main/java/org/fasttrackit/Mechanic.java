package org.fasttrackit;

public class Mechanic {
    public void repair (Vehicle vehicle){

        System.out.println("Repairing Vehicle: " + vehicle.name);
        vehicle.totalDistance--;
        vehicle.damaged = false;
    }
}
