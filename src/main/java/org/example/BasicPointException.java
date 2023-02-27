package org.example;

public class BasicPointException implements Cloneable{
    private final double x;
    private final double y;

    BasicPointException(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean checkEqual(BasicPointException newPoint){
        return this.x == newPoint.x && this.y == newPoint.y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

