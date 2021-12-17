package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];
        int [] arr3 = new int[n1 + n2];
        System.out.println("Enter arr1: ");
        enter_array(arr1);
        System.out.println("Enter arr2: ");
        enter_array(arr2);
        System.out.println("\nShow arr1: ");
        show(arr1);
        System.out.println("\nShow arr2: ");
        show(arr2);
        array_aggregation(arr1, arr2, arr3);
        System.out.println("\nArray after aggregation is: ");
        show(arr3);
    }
    static void enter_array(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }
    static void array_aggregation(int arr1[], int arr2[], int arr3[]) {
        int pos = 0;
        for (int element : arr1) {
            arr3[pos] = element;
            pos++;
        }
        for (int element : arr2) {
            arr3[pos] = element;
            pos++;
        }
    }
    static void show(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
