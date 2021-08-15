package BaiThucHanh2;

//Chuyển sang số la mã

import java.util.Scanner;

public class Bai2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = sc.nextInt();
        String p = "MDCLXVI";
        String result = "";
        while(n >= 1000) {
            result += 'M';
            n -= 1000;
        }
        while(n>=500) {
            result += 'D';
            n -= 500;
        }
        while(n>=100) {
            result += 'C';
            n-=100;
        }
        while(n>=50) {
            result += 'L';
            n-=50;
        }
        while(n>=10) {
            result += 'X';
            n-=10;
        }
        while(n>=5) {
            result += 'V';
            n-=5;
        }
        while(n>=1) {
            result+='I';
            n-=1;
        }
        System.out.println(result);
    }
}
