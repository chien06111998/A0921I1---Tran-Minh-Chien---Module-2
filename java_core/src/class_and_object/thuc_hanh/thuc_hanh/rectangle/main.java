package class_and_object.thuc_hanh.thuc_hanh.rectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.print("Your rectangle: " + rectangle.display());
        System.out.print("\nPerimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.print("\nArea of the rectangle: " + rectangle.getArea());
    }
}
