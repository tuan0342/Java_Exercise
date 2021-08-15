package BaiThucHanh1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double)1/i;
        }
        System.out.printf("Tong bang: %.2f", sum);
    }
}
