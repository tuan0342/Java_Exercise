package BaiThucHanh1;

import java.util.Scanner;

public class Bai1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        n = sc.nextInt();

        if (n % 2 == 0) {
            i = 2;
        } else {
            i = 1;
        }

        long sum = 0;
        for (; i <= n; i+=2) {
            sum+=i;
        }
        System.out.println("Tong: " + sum);
    }
}
