package class_and_object.thuc_hanh.thuc_hanh.rectangle;

public class Rectangle {
    double height, width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }
    public String display() {
        return "Rectangle : " + "width = " + width + ", height = " + height + ".";
    }
}
