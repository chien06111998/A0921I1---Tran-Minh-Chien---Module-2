package abstractclass_and_interface.thuc_hanh.bai_tap.interface_colorable;

public class Square implements InterfaceColorable{
    private double side = 4.5;
    private String color = "Green";
    private boolean fillter = true;

    public Square() {
    }

    public Square(double side, String color, boolean fillter) {
        this.side = side;
        this.color = color;
        this.fillter = fillter;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFillter() {
        return fillter;
    }

    public void setFillter(boolean fillter) {
        this.fillter = fillter;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square : " +
                "side=" + side +
                ", area = " + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Paint the four sides of a square.");
    }
}
