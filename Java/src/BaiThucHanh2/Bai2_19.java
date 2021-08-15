package BaiThucHanh2;

//Tách từ trong câu và in ta theo thứ tự alphabet


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Bai2_19 {
    public static void main(String[] args) throws IOException {

        File file = new File("input2.txt");
        Scanner sc = new Scanner(file);
        PrintWriter xuatFile = new PrintWriter("output2.txt", "UTF-8");

        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");

            //Sắp xếp
            Arrays.sort(arr);


//            //Xuất file
//            for (int i = 0; i < arr.length; i++) {
//                xuatFile.print(arr[i] + " ");
//
//            }
//            xuatFile.println();

            xuatFile.print(Arrays.toString(arr));
        }

        xuatFile.close();

    }
}
