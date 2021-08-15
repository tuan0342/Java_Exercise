package BaiThucHanh2;

import java.util.Scanner;

public class Bai2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr, res;
        arr = new int[n];
        res = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            res[i] = -1;
        }

        //Dem so lan xuat hien
        int count;
        for (int i = 0 ; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    res[j] = 0;
                }
            }

            if (res[i] != 0) {
                res[i] = count;
            }
        }

        //Xuat ra man hinh so lan xuat hien cua tung phan tu rieng biet
        for (int i = 0 ; i < n; i++) {
            if (res[i] != 0) {
                System.out.println("Phan tu " + arr[i] + " : " + res[i]);
            }
        }

        System.out.println();
        //Xuat ra man hinh phan tu xuat hien nhieu nhat
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max) max= res[i];
        }
        System.out.print("So lan xuat hien nhieu nhat la: " + max + ". Phan tu xuat hien nhieu nhat la: ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max) System.out.print(arr[i] + ", ");
        }
        System.out.println("\b\b");
    }
}
