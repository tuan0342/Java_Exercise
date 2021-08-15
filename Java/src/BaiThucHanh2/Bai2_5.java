package BaiThucHanh2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2_5 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang a: ");
        int n = sc.nextInt(); // So phan tu cua mang a
        System.out.println("Nhap so phan tu cua mang b: ");
        int m = sc.nextInt(); // So phan tu cua mang b
        int k = n + m;        // So phan tu cua mang c
        System.out.println("Nhap gia tri p: ");
        int p = sc.nextInt();

        //Nhap mang a, b
        int[] a, b, c;
        System.out.println("Nhap vao mang a: ");
        a = nhap(n);
        System.out.println("Nhap vao mang b: ");
        b = nhap(m);
        c = new int[k];

        //Ghép mảng b vào mảng a ở vị trí p
        for (int i = 0; i < p ; i++) {
            c[i] = a[i];
        }
        for (int i = 0 ; i < m ; i++) {
            c[i + p] = b[i];
        }
        for (int i = p ; i < n ; i++) {
            c[i + m] = a[i];
        }

        //Xuat kq
        System.out.println("Mang a[]: " + Arrays.toString(a));
        System.out.println("Mang b[]: " + Arrays.toString(b));
        System.out.println("Mang c[]: " + Arrays.toString(c));
    }

    public static int[] nhap(int n) {
        int[] a = new int[n];
        for (int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
