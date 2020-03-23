package org.fasttrackit;

public class Mechanic {
    public void repair (Vehicle vehicle){

        System.out.println("Repairing Vehicle: " + vehicle.getName());
        vehicle.setTotalDistance(vehicle.getTotalDistance() - 1);
        vehicle.setDamaged(false);
    }
}
