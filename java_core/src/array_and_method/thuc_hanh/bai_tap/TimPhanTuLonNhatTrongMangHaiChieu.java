package array_and_method.thuc_hanh.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        System.out.println("Enter arr: ");
        enter_array(arr, n, m);
        show(arr, n, m);
        System.out.println("The max value is: " + max_value(arr,n,m));
    }
    static void enter_array(int arr[][], int n, int m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static void show(int arr[][], int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }
    static int max_value(int arr[][], int n, int m) {
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
