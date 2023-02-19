package com.example.tpolab1.task3;

public enum Engine {
    PHOTONIAN(0),
    ELECTRIC(0),
    REACTIVE(0),
    ICE(0);

    private final double maxSpeed;

    Engine(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
