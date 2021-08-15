package BaiThucHanh2;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int [] a;
        System.out.println("Nhap gia tri cho mang: ");
        a = nhap(n, sc);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            a[n] = x;
        } else {
            for (int i = n; i > index; i--) {
                a[i] = a[i-1];
            }
            a[index] = x;
        }

        System.out.println(Arrays.toString(a));
    }

    public static int[] nhap(int n, Scanner sc) {
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++ ) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
