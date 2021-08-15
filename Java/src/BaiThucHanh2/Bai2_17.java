package BaiThucHanh2;

//Nhập "họ đệm tên" sau chuyển sang "tên họ đệm"
// Ngo Van Tuan ---> Tuan Ngo Van

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Bai2_17 {
    public static void main(String[] args) throws IOException {

        //Đọc file
        Scanner inputFromFile = new Scanner(Paths.get("input1.txt"), "UTF-8");
        PrintWriter printWriter = new PrintWriter("KETQUA.OUT", "UTF-8");

        while(inputFromFile.hasNextLine()) {
            String name = inputFromFile.nextLine();

            name = name.trim(); // Xóa dấu cách thừa ở cuối và đầu

            String[] arr = name.split(" ");    //Tách các từ trong họ tên

            //Dùng class StringBuilder để ghép các từ vào
            StringBuilder builder = new StringBuilder();
            builder.append(arr[arr.length-1] + " ");      //Ghép tên vào đầu tiên
            for (int i = 0 ; i < arr.length -1; i++) {
                if (arr[i].length() != 0) {
                    builder.append(arr[i] + " ");
                }
            }
            name = builder.toString();

            //Xuất kết quả
            printWriter.println(name);
        }

        //Sau khi thực hiện xong các bước trên pải đóng file lại
        printWriter.close();
        inputFromFile.close();
    }

}
