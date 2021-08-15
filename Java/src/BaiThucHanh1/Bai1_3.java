package BaiThucHanh1;

import java.util.Scanner;

public class Bai1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2*n; j++) {
                int x = j - n;
                if (x < 0 ) {
                    x *= -1;
                }
                int output = i - x;
                if (output > 0) {
                    System.out.printf("%3d", output);
                }
                else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
    }
}
