
import subject.Subject;
import subject.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject subject;
        subject = getInfoSubject();
        System.out.println(subject.toString());
        subject.comment("Mon hoc nay kho qua");
    }

    public static Subject getInfoSubject() {
        Subject s;

        Scanner sc = new Scanner(System.in);
        String nameSub, maHocPhan, nameTeacher, vien, trinhDo;
        int soTiet, soTinChi;

        System.out.println("Nhap ten mon hoc: ");
        nameSub = sc.nextLine();
        System.out.println("Nhap ma hoc phan: ");
        maHocPhan = sc.nextLine();
        System.out.println("Nhap so tiet: ");
        soTiet = sc.nextInt();
        System.out.println("Nhap so tin chi: ");
        soTinChi = sc.nextInt() ;

        String c = sc.nextLine();


        System.out.println("Nhap ten giang vien: ");
        nameTeacher = sc.nextLine() ;
        System.out.println("Nhap ten vien quan ly: ");
        vien = sc.nextLine();
        System.out.println("Nhap trinh do: ");
        trinhDo = sc.nextLine();

        Teacher giangVien = new Teacher(nameTeacher, vien, trinhDo);
        s = new Subject(nameSub, maHocPhan, soTiet, soTinChi, giangVien);
        return s;
    }

}
