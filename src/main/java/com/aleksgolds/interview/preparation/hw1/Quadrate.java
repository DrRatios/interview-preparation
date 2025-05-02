package com.aleksgolds.interview.preparation.hw1;

public class Quadrate extends Shape {

    private double side;


    public Quadrate(double side) {
        this.side = side;

    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double size() {
        return side*side;
    }

    @Override
    public void draw() {
        System.out.println("Quadrate");
    }
}
