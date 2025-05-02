package com.aleksgolds.interview.preparation.hw1;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double size(){
        return (base*height)/2;
    }


    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
