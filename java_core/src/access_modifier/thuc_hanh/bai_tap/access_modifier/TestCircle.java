package access_modifier.thuc_hanh.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "Yellow");
//        circle.getRadius();
//        circle.getArea();
        System.out.println("Radius = " + circle.getRadius() + ", Area = " + circle.getArea());
    }
}
