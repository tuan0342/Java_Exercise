package BaiThucHanh2;

import java.util.Scanner;

public class Bai2_9 {
    public static void main(String[] args) {
        int m, n, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m: ");
        m = sc.nextInt();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Nhap k: ");
        k = sc.nextInt();
        int[][] arr, brr, crr;

        System.out.println("Nhap ma tran arr: ");
        arr = nhap(m , n, sc);
        System.out.println("Nhap ma tran brr: ");
        brr = nhap(n , k, sc);

        crr = tichMaTran(arr, brr);

        System.out.println("Ket qua: ");
        show(crr);

    }

    private static void show(int[][] crr) {
        int m = crr.length;
        int k = crr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] tichMaTran(int[][] arr, int[][] brr) {
        int[][] crr = new int[arr.length][brr[0].length];
        int m = arr.length;
        int k = brr[0].length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0 ; j < k; j++) {
                for (int h = 0; h < n; h++) {
                    crr[i][j] += (arr[i][h] * brr[h][j]);
                }
            }
        }
        return crr;
    }

    private static int[][] nhap(int m, int n, Scanner scanner) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
}
