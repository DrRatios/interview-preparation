package com.aleksgolds.interview.preparation.hw1;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double size() {
        return Math.PI * radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
