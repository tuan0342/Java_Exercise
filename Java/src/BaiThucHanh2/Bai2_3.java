package BaiThucHanh2;

import java.util.Scanner;

public class Bai2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int tmp = -1;
        for (int i = 0 ; i < n; i++) {
            if (soNT(a[i])) {
                if (Math.abs(a[i] - x) < min) {
                    min = Math.abs(a[i] - x);
                    tmp = i;
                }
            }
        }
        System.out.println(tmp);
    }

    public static boolean soNT(int n) {
        if (n == 2) return true;
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
