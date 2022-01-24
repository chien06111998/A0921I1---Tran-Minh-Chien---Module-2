package abstractclass_and_interface.thuc_hanh.bai_tap.interface_resizeable;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String colow, boolean fillter, double side) {
        super(colow, fillter);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square : " +
                "side=" + side +
                ", " + super.toString() + ", area = " + getArea();
    }

    @Override
    public void reSize(double persent) {
        this.side = (persent / 200);
    }
}
