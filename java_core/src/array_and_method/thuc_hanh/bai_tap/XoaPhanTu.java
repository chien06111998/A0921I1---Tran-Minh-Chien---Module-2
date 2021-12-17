package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter length of array: ");
        do {
            n = sc.nextInt();
        } while (n < 0);
        int [] arr = new int[n];
        int [] arr1 = new int[n-1];
        System.out.println("Enter index of array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        show(arr,n);
        System.out.println("\nEnter number to delete: ");
        int val = sc.nextInt();
        System.out.println("Array after deletion is: ");
        delete_value(arr,n,val);
        for (int i = 0; i < n-1; i++) {
            arr1[i] = arr[i];
        }
        show(arr1, arr1.length);
    }
    static void show(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void delete_value(int arr[], int n, int value) {
        int i = 0;
        while (i < n && arr[i] != value) {
            i++;
        }
        if (arr[i] != value) {
            System.out.println("no " +value+ " in the array.");
        } else {
            for (int j = i; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
        }
    }
}
