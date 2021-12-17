package array_and_method.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter length of array: ");
        do {
            n = sc.nextInt();
        } while (n < 0);
        int [] arr = new int[n];
        System.out.println("Enter index of array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray reversal: ");
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("The after-inversion is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
