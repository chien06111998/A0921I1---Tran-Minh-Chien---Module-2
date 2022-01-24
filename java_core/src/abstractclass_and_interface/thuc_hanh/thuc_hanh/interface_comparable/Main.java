package abstractclass_and_interface.thuc_hanh.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle [] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(2.5);
        circles[1] = new ComparableCircle(4.0, "yellow", false);
        circles[2] = new ComparableCircle();
        System.out.println("Pre-sorted");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted: ");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println(comparableCircle);
        }
    }
}
