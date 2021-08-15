package BaiThucHanh1;

import java.util.Scanner;

public class Bai1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int x = 2;

        while (true) {
            if (checkNT(x)) {
                System.out.print(x + " ");
                count++;
            }
            if (x == 2) {
                x++;
            } else {
                x+=2;
            }
            if(count == n) break;
        }
    }

    public static boolean checkNT(int n) {
        if (n == 2) return true;
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
