package newKnowledge;

import java.io.*;
import java.util.Scanner;

public class DocFile2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        PrintWriter xuatFile = new PrintWriter("OUTPUT2.txt", "UTF-8");

          //Xuất lại file gốc
//        while(sc.hasNextLine()) {
//            String str = sc.nextLine();
//            xuatFile.println(str);
//        }


        //Xuất file số
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
        int[] arr = new int[12];
        int i = 0;
        while(sc.hasNextInt()) {
            arr[i] = sc.nextInt();
            i++;
            if (i >= 11) {
                break;
            }
        }
        for(int j = 0; j < i; j++) {
            xuatFile.print(arr[j] + "---");
        }


        xuatFile.close();

    }
}
