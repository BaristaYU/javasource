package classtest;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        double area = radius * radius * 3.14;
        return area;
    }

}
