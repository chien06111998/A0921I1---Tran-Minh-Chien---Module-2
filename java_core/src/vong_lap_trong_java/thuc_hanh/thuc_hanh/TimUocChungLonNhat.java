package vong_lap_trong_java.thuc_hanh.thuc_hanh;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println(a + " and " + b + " no greatest common factor");
        } else {
            while (a != b) {
                if (a < b) {
                    b = b - a;
                } else {
                    a = a - b;
                }
            }
        }
        System.out.println("Greatest common factor is: " + a);
    }
}
