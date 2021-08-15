package BaiThucHanh1;

import java.util.Scanner;

public class Bai1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = m; i <= n; i++) {
            if(soChinhPhuong(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }

    public static boolean soChinhPhuong(int n) {
        return Math.sqrt((double)n) == (int)Math.sqrt((double)n);
    }
}


