package array_and_method.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
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
        System.out.println("\nThe min value is: " + show_min(arr, n));
    }
    public static int show_min(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
