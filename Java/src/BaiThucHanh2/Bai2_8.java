package BaiThucHanh2;

import java.util.Scanner;

public class Bai2_8 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri m va n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr, brr;
        System.out.println("Nhap ma tran arr: ");
        arr = nhap(n, m, sc);

        brr = chuyenVi(arr);

        System.out.println("Mang arr la: ");
        show(arr);

        System.out.println("Mang brr la: ");
        show(brr);

    }

    private static void show(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] chuyenVi(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] brr = new int[n][m];
        for (int i = 0 ; i < n; i++) {
            for (int j = 0 ; j < m; j++) {
                brr[i][j] = arr[j][i];
            }
        }
        return brr;
    }

    private static int[][] nhap(int n, int m, Scanner scanner) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        return a;
    }
}
