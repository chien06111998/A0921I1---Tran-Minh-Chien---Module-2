package inhertance.thuc_hanh.bai_tap.circle_and_cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Circle circle = new Circle(3.5, "Yellow");
        Cylinder cylinder = new Cylinder(2.5);
        circle = new Circle(4.0, "Blue");
        System.out.println(circle);
        System.out.println("-------------------");
        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);
    }
}
