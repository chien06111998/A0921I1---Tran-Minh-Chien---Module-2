package vong_lap_trong_java.thuc_hanh.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien cho vay: ");
        double a = sc.nextDouble();
        System.out.println("Nhap ti le lai suat thang: ");
        double b = sc.nextDouble();
        System.out.println("Nhap so thang: ");
        int c = sc.nextInt();
        double tienLai = 0;
        tienLai = a * (b / 100) * c;
        System.out.printf("Tien lai khi vay " + a + "vnd trong " + c + " than la: " + tienLai);
    }
}
