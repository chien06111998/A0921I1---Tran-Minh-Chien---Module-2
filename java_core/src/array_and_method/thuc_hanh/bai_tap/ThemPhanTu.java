package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter length of array: ");
        do {
            n = sc.nextInt();
        } while (n < 0);
        int [] arr = new int[n];
        int [] arr1 = new int[n+1];
        System.out.println("Enter index of array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        show(arr);
        copy_array(arr, arr1);
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        System.out.print("Enter index: ");
        int ind;
        do {
            ind = sc.nextInt();
        }while (ind < 0 || ind > n+1);
        System.out.print("Array after adding is: ");
        add(arr1, val, ind);
        show(arr1);
    }
    static void copy_array(int arr[], int arr1[]) {
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
    }
    static void show(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void add(int arr[], int value, int index) {
        if (index < 0 && index > arr.length - 1) {
            System.out.println("Incorrect insertion location");
        }
        for (int j = arr.length-1; j >= index; j--) {
            arr[j] = arr[j-1];
        }
        arr[index] = value;
    }
}
