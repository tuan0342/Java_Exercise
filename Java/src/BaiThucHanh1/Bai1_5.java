package BaiThucHanh1;

import java.util.Random;
import java.util.Scanner;

public class Bai1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            x = sc.nextInt();
        } while (x <=0 || x >= 100);
        Random rand = new Random();
        int count= 0;
        while(true) {
            int randNumber = rand.nextInt(100);
            count++;
            System.out.println("Random number: " + randNumber + " number X: " + x);
            if (x == randNumber) {
                System.out.println("So lan thuc hien: " + count);
                break;
            }
        }
    }
}
