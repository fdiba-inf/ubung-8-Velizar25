package exercise8;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
      
        x = Utils.INPUT.nextDouble();
        y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        this.x = x + xDelta;
        this.y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        Point p = new Point();
        p.x = x + xDelta;
        p.y = y + yDelta;
    return p;
    }

    public boolean equals(Point otherPoint) {
        if (this.x == otherPoint.x && this.y == otherPoint.y) {
            return true;
        } else {
            return false;
        }

    }

    public String toString() {

        return "(" + x  + ", " + y + ")";
    }
}