package abstractclass_and_interface.thuc_hanh.bai_tap.interface_resizeable;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String colow, boolean fillter, double width, double length) {
        super(colow, fillter);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle : " +
                "width = " + width +
                ", length = " + length +
                ", " + super.toString() + ", area = " + getArea();
    }

    @Override
    public void reSize(double persent) {
        this.width *= (persent / 200);
        this.length *= (persent / 200);
    }
}
