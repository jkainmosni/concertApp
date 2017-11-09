package com.geometry.Shape;

public abstract class Shape {

    protected String name;

    public abstract double circumference();

    public abstract double area();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
