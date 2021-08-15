package BaiThucHanh2;
//Phép tính với số nguyên lớn


import java.math.BigInteger;
import java.util.Scanner;

public class Bai2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        BigInteger a = sc.nextBigInteger();
        System.out.println("Nhap b : ");
        BigInteger b = sc.nextBigInteger();

        System.out.println("Tong: " + a.add(b));
        System.out.println("Hieu: " + a.subtract(b));
        System.out.println("Tich: " + a.multiply(b));
        System.out.println("Thuong : " + a.divide(b));
    }
}
