package org.fasttrackit;

public class Autovehicle extends Vehicle {
    private Engine engine;

    public Autovehicle(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}