package BaiThucHanh1;

import java.util.Scanner;

public class Bai1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0) {
            sum = sum + (n%10);
            n/=10;
        }
        System.out.println(sum);
    }
}
