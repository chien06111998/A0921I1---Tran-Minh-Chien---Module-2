package abstractclass_and_interface.thuc_hanh.thuc_hanh.interface_comparable;

public class Circle {
    private double radius;
    private String colow;
    private boolean filled = true;

    public Circle() {
    }

    public Circle(double radius, String colow, boolean filled) {
        this.radius = radius;
        this.colow = colow;
        this.filled = filled;
    }

    public Circle(double radius) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColow() {
        return colow;
    }

    public void setColow(String colow) {
        this.colow = colow;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colow='" + colow + '\'' +
                ", filled=" + filled +
                '}';
    }
}
