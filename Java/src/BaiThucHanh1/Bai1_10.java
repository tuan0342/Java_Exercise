package BaiThucHanh1;

import java.util.Scanner;

public class Bai1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        if (n == 1) {
            System.out.println(n + " = 1" );
        } else {
            System.out.print(n + " = ");
            while (n != 1) {
                if (n % i == 0) {
                    System.out.print(i + " x ");
                    n /= i;
                } else {
                    ++i;
                }
                if (n == 1) break;
            }
            System.out.println("\b\b\b");
        }
    }
}
