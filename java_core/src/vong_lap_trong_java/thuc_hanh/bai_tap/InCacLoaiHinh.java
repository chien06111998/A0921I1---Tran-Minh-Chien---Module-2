package vong_lap_trong_java.thuc_hanh.bai_tap;

import java.util.Scanner;

public class InCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("-----------------Menu-----------------");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            choice = sc . nextInt();
            if (choice < 0 || choice > 3){
                System.out.println("Entering the wrong re-entry request: Choice = ");
            }
        } while (choice < 0 || choice > 3);
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Enter height: ");
                    int height = sc.nextInt();
                    System.out.println("Enter weight: ");
                    int weight = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < weight; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter n: ");
                    int n = sc.nextInt();
                    for (int i = 0; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter n: ");
                    int m = sc.nextInt();
                    for (int i = m; i >= 0 ; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
}
