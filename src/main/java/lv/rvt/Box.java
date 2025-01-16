package lv.rvt;

public class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(Box oldBox) {
        this.length = oldBox.length;
        this.width = oldBox.width;
        this.height = oldBox.height;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.length(), 1.25 * oldBox.width(), 1.25 * oldBox.height());
    }

    public Box smallerBox (Box oldBox) {
        return new Box(0.75 * oldBox.length(), 0.75 * oldBox.width(), 0.75 * oldBox.height());
    }

    public boolean nests(Box outsideBox) {
        return this.length < outsideBox.length() && this.width < outsideBox.width() && this.height < outsideBox.height();
    }

    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ; 
    }

    double volume() {
        return length * width * height;
    }

    double faceArea() {
        return length * width;
    }

    double topArea() {
        return width * height;
    }

    double sideArea() {
        return height * length;
    }
}