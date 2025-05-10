package test;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập độ dài cạnh a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập độ dài cạnh b: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhập độ dài cạnh c: ");
        int c = scanner.nextInt();
        
        if (isTriangle(a, b, c)) {
            System.out.println("Ba số này có thể là độ dài của ba cạnh một tam giác.");
        } else {
            System.out.println("Ba số này không thể là độ dài của ba cạnh một tam giác.");
        }
        
        scanner.close();
    }
    
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}