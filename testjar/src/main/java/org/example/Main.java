package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        String dec = String.valueOf(LocalDateTime.now().plusHours(7).plusMinutes(5));
//        System.out.println(dec);

        System.out.println("Vui long nhap so nguoi tham gia dau gia:");
        int count = 0;
        count = sc.nextInt();
        System.out.println("So luong nguoi tham gia dau gia la: " + count);
    }
}