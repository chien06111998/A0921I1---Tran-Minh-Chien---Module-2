package abstractclass_and_interface.thuc_hanh.bai_tap.interface_resizeable;

public abstract class Shape implements InterfaceResizeable{
    private String colow;
    private boolean fillter = true;

    public Shape() {
    }

    public Shape(String colow, boolean fillter) {
        this.colow = colow;
        this.fillter = fillter;
    }

    public String getColow() {
        return colow;
    }

    public void setColow(String colow) {
        this.colow = colow;
    }

    public boolean isFillter() {
        return fillter;
    }

    public void setFillter(boolean fillter) {
        this.fillter = fillter;
    }

    public static void show (Shape [] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    @Override
    public String toString() {
        return  "colow = '" + colow + '\'' +
                ", fillter = " + fillter +
                '}';
    }
}
