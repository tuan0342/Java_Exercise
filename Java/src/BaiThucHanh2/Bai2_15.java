package BaiThucHanh2;
//CHuẩn hóa xâu

import java.util.Scanner;

public class Bai2_15 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        System.out.print(chuanHoa(str));
    }

    private static String chuanHoa(String str) {
        str = str.toLowerCase();   //Viết thường toàn bộ

        String result = "";
        String[] arr = str.split(" ");    //tách xâu ban đầu thành mảng String

        for (String s : arr) {             //Sử dụng foreach để duyệt phần tử
            if (!s.equals("") && !s.equals(null)) {        //Kiểm tra xem mảng arr thứ i có khác rỗng hay " " hay ko
                //Tiến hành viết hoa chữ cái đầu bằng các sử dụng valueOf ( valueOf để biến từ dạng khác sang xâu)
                //Sau khi viết hoa xong thì tiến hành cộng phần tử thứ 2 (có chỉ số là 1)  rồi cộng với dấu cách
                result += String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1) + " ";
            }
        }

        result = result.substring(0, result.length() - 1);    //Xóa dấu cách cuối

        return result;
    }

}
