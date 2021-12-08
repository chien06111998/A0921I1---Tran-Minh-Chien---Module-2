package vong_lap_trong_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("-----------------Menu-----------------");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
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
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
}
