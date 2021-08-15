package BaiThucHanh2;

import java.util.Scanner;

public class Bai2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ok = true;
        int mid = n / 2;
        for (int i = 0; i <= mid; i++) {
            int x = n - 1 - i;
            if (arr[i] != arr[x]) {
                ok = false;
                break;
            }
        }
        if (ok == true) {
            System.out.println("Mang doi xung");
        } else {
            System.out.println("Mang khong doi xung");
        }
    }
}
