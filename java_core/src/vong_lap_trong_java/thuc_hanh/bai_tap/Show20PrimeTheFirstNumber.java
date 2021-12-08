package vong_lap_trong_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class Show20PrimeTheFirstNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("20 Prime The First Number: ");
        int count = 0;
        int i = 2;
        while (count < 20) {
            if (check_prime(i)) {
                System.out.print(i + ", ");
                count++;
            }
            i++;
        }
    }
    public static boolean check_prime(int n) {
        if (n < 2) {
            return false;
        }
        int square_root = (int) Math.sqrt(n);
        for (int i = 2; i < square_root; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
