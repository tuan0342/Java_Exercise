package BaiThucHanh2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Bai2_19_Part2 {
    public static void main(String[] args) throws IOException {
        //Đoc file
        Scanner inputFromFile = new Scanner(Paths.get("input3.txt"), "UTF-8");

        //Ghi file
        PrintWriter printWriter = new PrintWriter("output3.txt", "UTF-8");

        String ex;
        while(inputFromFile.hasNextLine()) {
            ex = inputFromFile.nextLine();
            String[] arr = ex.split(" ");    //Tách từ

            Arrays.sort(arr);            //Sắp xếp

            for (String x: arr) {
                printWriter.print(x + " ");
            }
            printWriter.println();
        }


        //Đóng kết nối với file
        inputFromFile.close();
        printWriter.close();
    }
}
