package ex7;

public class Circle {

    private String color = "Red";
    private double radius = 1.0;

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {//Count and return area
        double area = 3.14 * getRadius() * getRadius();
        return area;
    }

    public String info() {
        String s;
        if (this.radius <= 0) {//Check if radius is positive number or not
            s = String.format("Error please go back and input again!");
        } else {
            s = String.format("%.1f\t|\t%s\t|\t%.1f", this.radius, this.color, getArea());
        }
        return s;
    }

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }
}
