package com.omelchenkoaleks.baseandroid.pojo;

public class Car {
    private String model;
    private int speed;
    private double engine;

    public Car(String model, int speed, double engine) {
        this.model = model;
        this.speed = speed;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double isEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
