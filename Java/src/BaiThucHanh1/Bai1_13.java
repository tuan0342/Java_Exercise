package BaiThucHanh1;

import java.util.Scanner;

public class Bai1_13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000; i <= 999999; i++) {
            if(soThuanNghich(i)) {
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean soThuanNghich(int n) {
        int temp = 0;
        int x = n;
        while(x > 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        if (temp == n) return true;
        return false;
    }
}
