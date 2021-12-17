package class_and_object.thuc_hanh.bai_tap.quadratic_equation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        double a = sc.nextDouble();
        System.out.print("Enter b = ");
        double b = sc.nextDouble();
        System.out.print("Enter c = ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (a == 0) {
            System.out.print("The most experimental equation is: " + quadraticEquation.getFirstEquation());
        } else {
            if (quadraticEquation.getDiscriminant() < 0) {
                System.out.println("Inexperienced equations.");
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Double-tested equations is: " + quadraticEquation.getRoot3());
            } else {
                System.out.println("The equation has two distinct experiments is: x1 = " + quadraticEquation.getRoot1() + " and x2 = " + quadraticEquation.getRoot2());
            }
        }
    }
}
