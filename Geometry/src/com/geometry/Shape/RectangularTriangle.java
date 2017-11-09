package com.geometry.Shape;

import com.geometry.basic.Line;

public class RectangularTriangle extends Shape {
    private Line sideA;
    private Line sideB;

    public RectangularTriangle(Line sideA, Line sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.name = "Rectangular Triangle";
    }

    @Override
    public double circumference() {
        double aLength = this.sideA.distance();
        double bLength = this.sideB.distance();
        double cLength = Math.sqrt(Math.pow(aLength, 2) + Math.pow(bLength, 2));
        return aLength + bLength + cLength;
    }

    @Override
    public double area() {
        double aLength = this.sideA.distance();
        double bLength = this.sideB.distance();
        return (aLength + bLength) / 2;
    }

    @Override
    public String getName() {
        return name;
    }

}
