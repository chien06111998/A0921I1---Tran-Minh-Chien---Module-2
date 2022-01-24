package abstractclass_and_interface.thuc_hanh.bai_tap.interface_resizeable;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String colow, boolean fillter, double radius) {
        super(colow, fillter);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle : " +
                "radius = " + radius +
                ", " + super.toString() + ", area = " + getArea();
    }

    @Override
    public void reSize(double persent) {
        this.radius *= (persent / 200);
    }
}
