package abstractclass_and_interface.thuc_hanh.bai_tap.interface_resizeable;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle("Yellow", false, 3.5);
        shapes[1] = new Rectangle("", true, 4.0, 2.5);
        shapes[2] = new Square("Green", false, 5.0);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("\n");
        Shape.show(shapes);
    }
}
