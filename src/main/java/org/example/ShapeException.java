package org.example;

public class ShapeException {
    static final String CIRCLE = "circle";
    static final String RECTANGLE = "rectangle";
    private static final double PI = 3.14;
    private final String type;
    private double triangleL1;
    private double triangleL2;
    private double triangleL3;
    private double triangleHeight;
    private double triangleBase;
    private double rectLength;
    private double rectWidth;
    private double radius;

    ShapeException(String type, double radius) {
        this.type = type;
        this.radius = radius;
    }

    ShapeException(String type, double rectLength, double rectWidth) {
        this.type = type;
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
    }

    ShapeException(String type, double triangleL1, double triangleL2, double triangleL3, double triangleHeight,
          double triangleBase) {
        this.type = type;
        this.triangleL1 = triangleL1;
        this.triangleL2 = triangleL2;
        this.triangleL3 = triangleL3;
        this.triangleHeight = triangleHeight;
        this.triangleBase = triangleBase;
    }

    public double perimeter() {
        if (type.equals(CIRCLE)) {
            return (radius * 2 * PI);
        } else if (type.equals(RECTANGLE)) {
            return (2 * (rectLength + rectWidth));
        } else {
            return triangleL1 + triangleL2 + triangleL3;
        }
    }

    public double area() {
        if (type.equals(CIRCLE)) {
            return (PI * radius * radius);
        } else if (type.equals(RECTANGLE)) {
            return (rectLength * rectWidth);
        } else {
            return (triangleBase * triangleHeight) / 2;
        }
    }
}

