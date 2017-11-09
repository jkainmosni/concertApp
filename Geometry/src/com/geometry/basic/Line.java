package com.geometry.basic;

import com.geometry.metric.EuclideanMetric;

public class Line implements EuclideanMetric{

    private Point pointA;
    private Point pointB;

    public Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    @Override
    public double distance() {
        return distance(this.pointA, this.pointB);
    }

    @Override
    public double distance(Point a, Point b) {
        double x = Math.abs(a.getX() - b.getX());
        double y = Math.abs(a.getY() - b.getY());
        return Math.sqrt(Math.pow(x, 2)) + Math.sqrt(Math.pow(y, 2));
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
}
