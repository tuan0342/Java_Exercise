package BaiThucHanh2;

import java.util.Scanner;

public class Bai2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soChuyen, heChuyen;
        System.out.println("Nhap vao so chuyen: ");
        soChuyen = sc.nextInt();
        System.out.println("Nhap vao he chuyen: ");
        heChuyen = sc.nextInt();
        String arr = bienDoi(soChuyen, heChuyen);
        StringBuilder str = new StringBuilder(arr);     //Phương thức đảo xâu kí tự
        System.out.println(str.reverse().toString());
        System.out.println(arr.toString());
//        for (int i = 0 ; i < str.length(); i++) {
//            System.out.print(str.charAt(str.length() - 1 - i));
//        }
    }

    private static String bienDoi(int soChuyen, int heChuyen) {
        String str = "";
        int i = 0;
        String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while(soChuyen > 0) {
            str += s.charAt(soChuyen % heChuyen);
            i++;
            soChuyen /= heChuyen;
        }
        return str;
    }
}
