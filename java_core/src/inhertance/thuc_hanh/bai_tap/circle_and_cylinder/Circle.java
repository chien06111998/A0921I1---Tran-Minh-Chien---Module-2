package inhertance.thuc_hanh.bai_tap.circle_and_cylinder;

public class Circle {
    protected double radius;
    protected String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + ", area = " + getArea(radius) +'\'' +
                '}';
    }
}