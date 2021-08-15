package BaiThucHanh2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];

        //Cap phat gia tri ngau nhien cho mang arr
        Random rand = new Random();
        for (int i = 0 ; i < n; i++) {
            arr[i] = rand.nextInt(200);
        }

        //Tao mang brr chua cac gia tri phan biet cua mang arr
        int bSize = 0;
        boolean isExits = false;
        for (int i = 0 ; i < n; i++) {
            isExits = false;
            for (int j = 0; j < n; j++) {
                if (arr[i] == brr[j]) {
                    isExits = true;
                    break;
                }
            }
            if (!isExits) {
                brr[bSize++] = arr[i];
            }
        }

        //Sap xep mang a
        System.out.println("Truoc khi sap xep: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sau khi sap xep: ");
        System.out.println(Arrays.toString(arr));

        //Hien thi mang chua cac phan tu phan biet cua mang a
        System.out.println(Arrays.toString(brr));
    }
}
