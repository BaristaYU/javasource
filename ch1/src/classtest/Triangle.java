package classtest;

public class Triangle {
    private int baseLine;
    private int height;

    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    public void setBaseLine(int baseLine) {
        this.baseLine = baseLine;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    double getArea() {
        return baseLine * height / 2.0;
    }
}
