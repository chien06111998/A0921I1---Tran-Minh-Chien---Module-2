package array_and_method.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
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
        System.out.println("\nThe max value is: ");
        int max = arr[0];
        for (int i = 1; i < n; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
