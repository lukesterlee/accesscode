package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/2/2015.
 */

public class Circle {

    private double radius;

    private static int numberOfCircles = 0;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double newRadius) {
        this.radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }
}
