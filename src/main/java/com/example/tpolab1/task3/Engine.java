package com.example.tpolab1.task3;

public enum Engine {
    PHOTONIAN(45),
    ELECTRIC(15),
    REACTIVE(30),
    ICE(10);

    private final double maxSpeed;

    Engine(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
