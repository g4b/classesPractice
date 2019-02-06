import java.lang.Math;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width*length;
    }

    public double getDiagonal() {
        return Math.sqrt((Math.pow(length, 2)) + (Math.pow(width, 2)));
    }

    public boolean isSquare() {
        return width == length;
    }
}