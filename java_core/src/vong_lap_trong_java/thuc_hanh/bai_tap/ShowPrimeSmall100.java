package vong_lap_trong_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class ShowPrimeSmall100 {
    public static void main(String[] args) {
        System.out.println("The number prime small 100 is: ");
        for (int i = 2; i < 100; i++) {
            if (check_prime(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    public static boolean check_prime(int n) {
        int square_root = (int) Math.sqrt(n);
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= square_root; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
