package abstractclass_and_interface.thuc_hanh.thuc_hanh.interface_comparable_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(3.6, "", true);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circle = new CircleComparable();
        Arrays.sort(circles, circle);
        System.out.println("Afer sorted");
        for (Circle circle1 : circles) {
            System.out.println(circle1);
        }
    }
}
