package com.vaibhavmojidra.androidjavademounittesting;

public class MyCalculations implements Calculations{

    final double PI=3.14;

    @Override
    public double calculateArea(double radius) {
        return (PI*radius*radius);
    }

    @Override
    public double calculateCircumference(double radius) {
        return (2*PI*radius);
    }
}
