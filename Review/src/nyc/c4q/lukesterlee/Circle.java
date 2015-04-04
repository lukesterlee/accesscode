package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 4/2/2015.
 */

public class Circle {

    private double radius;

    private static int numberOfCircles = 0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI*radius*radius;
        return area;

        // return Math.PI*radius*radius;
    }

    public double getCir

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
    }

}
