package BaiThucHanh1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai = sc.nextInt();
        int rong = sc.nextInt();
        for (int i = 1; i <= rong; i++) {
            for (int j = 1; j <= dai; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
