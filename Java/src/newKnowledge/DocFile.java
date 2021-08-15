package newKnowledge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

//        if (sc.hasNextLine()) {              //Kiểm tra xem có dòng đầu tiên hay ko
//            String str = sc.nextLine();      //Đọc nguyên dòng đâu tiên
//            System.out.println(str);
//        }

        //Đọc từ
//        String[] arr = new String[100];
//        int i = 0;
//        while(sc.hasNext()) {                  //Để đọc từng từ
//            arr[i] = sc.next();
//            i++;
//        }
//        showInfo(arr);

        //Đọc số
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        int[] arrNum = new int[100];
        int j = 0;
        while(sc.hasNextInt()) {
            arrNum[j++] = sc.nextInt();
            if (j > 100) {
                break;
            }
        }
        showNum(arrNum, j);
    }

    private static void showNum(int[] arrNum, int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(arrNum[i]);
        }
    }

//    private static void showInfo(String[] arr) {
//        for (String x : arr) {
//            if (x != null) {
//                System.out.print(x + "--");
//            }
//        }
//        System.out.println("\b\b");
//    }
}
