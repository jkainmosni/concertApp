package com.geometry.metric;

import com.geometry.basic.Point;

public interface EuclideanMetric {
    double distance();
    double distance(Point a, Point b);
}
