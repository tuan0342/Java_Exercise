package BaiThucHanh2;
//Tìm từ dài nhất

import java.util.Scanner;

public class Bai2_16 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();

        String[] arr = input.split("[. ,-]+");
        int lenMax = 0;
        int index = 0;
        int count = 0;
        for(String x : arr) {
            System.out.println(x);
        }
        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].length();
            if (arr[i] == null) {
                count++;
            }
            if (len > lenMax) {
                lenMax = len;
                index = i;
            }
        }

        System.out.println("Tu dai nhat la: " + arr[index]);
        System.out.println("Do dai cua tu dai nhat: " + lenMax + ". Vi tri cua tu dai nhat: " + (index + 1 - count));
    }




}
