package BaiThucHanh2;

import java.util.Scanner;

public class Bai2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n = sc.nextInt();
        int[] a;
        System.out.println("Nhap gia tri cho mang: ");
        a = nhap(n, sc);

        //Tao mang b chua do dai duong chay
        int[] b = new int[n];
        int index = 0;
        for (int i = 0 ; i < n-1; i++) {
            if (a[i] <= a[i+1]) {
                b[index]++;
            } else {
                b[index]++;
                index++;
            }
        }

        //Tim do dai duong chay dai nhat
        int max = 0;
        for (int x:b) {
            if (x>max) {
                max = x;
            }
        }

        //In ket qua ra man hinh
        for (int x:a) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x: b) {
            System.out.print(x + " ");
        }
        System.out.println();
        int vt = 0;
        for (int x:b) {
            if (max == x) {

                System.out.println("Vi tri cua duong chay: " + vt + ", do dai: " + max);
            }
            vt += x;
        }
    }

    public static int[] nhap(int n, Scanner scanner) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        return a;
    }
}
