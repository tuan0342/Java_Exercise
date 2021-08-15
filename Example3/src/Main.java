import students.Students;
import students.Subject;
import students.Teacher;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Students[] students;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int soLuong = sc.nextInt();
        students = new Students[soLuong];

        for (int i = 0; i < soLuong; i++) {
            students[i] = getInfoStudent();
            System.out.println(students[i].toString());
            students[i].hienThiTrangThaiHocTap(students[i].getSubject(), students[i].getSoLuongMonHoc());
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------");
        }
    }

    public static Teacher getInfoTeacher() {
        Teacher t;
        String nameTeacher;
        String vienQL;
        String trinhDo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten giang vien: ");
        nameTeacher = sc.nextLine();
        System.out.println("Nhap ten vien quan li: ");
        vienQL = sc.nextLine();
        System.out.println("Nhap trinh do giang vien: ");
        trinhDo = sc.nextLine();
        System.out.println();

        t = new Teacher(nameTeacher, vienQL, trinhDo);

        return t;
    }

    public static Subject getInfoSubject() {
        Subject s;

        Scanner sc = new Scanner(System.in);
        String nameSub, maHocPhan;
        int soTiet, soTinChi;
        Teacher teacher;
        double diemTrungBinh;
        int fee;

        System.out.println("Nhap ten mon hoc: ");
        nameSub = sc.nextLine();
        System.out.println("Nhap ma hoc phan: ");
        maHocPhan = sc.nextLine();
        System.out.println("Nhap so tiet cua mon " + nameSub + " : ");
        soTiet = sc.nextInt();
        System.out.println("NHap so tin chi cua mon " + nameSub + " : ");
        soTinChi = sc.nextInt();
        int amoutTest;
        System.out.println("Nhap so luong bai kiem tra: ");
        amoutTest = sc.nextInt();
        double[] diemTungBai = new double[amoutTest];
        System.out.println("Nhap diem tung bai kiem tra: ");
        for (int i = 0; i < amoutTest; i++) {
            diemTungBai[i] = sc.nextDouble();
        }


        //Lấy thông tin teacher
        teacher = getInfoTeacher();

        //lấy điểm trung bình
        s = new Subject(amoutTest, diemTungBai);
        s.setDiemTrungBinh(amoutTest, diemTungBai);
        diemTrungBinh = s.getDiemTrungBinh();

        s= new Subject(soTinChi);
        s.setFee(soTinChi);
        fee = s.getFee();

        s = new Subject(nameSub, maHocPhan, soTiet, soTinChi, amoutTest, teacher, diemTungBai, diemTrungBinh, fee);

        return s;
    }

    public static Students getInfoStudent() {
        Students students = null;
        String nameStudent, address, email, phoneNumber, id, sex;
        int age;


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        nameStudent = sc.nextLine();
        System.out.println("Nhap dia chi sinh vien: ");
        address = sc.nextLine();
        System.out.println("Nhap so dien thoai sinh vien: ");
        phoneNumber = sc.nextLine();
        System.out.println("Nhap MSSV: ");
        id = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        sex = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
        String c = sc.nextLine();
        System.out.println("Nhap email sinh vien: ");
        email = sc.next();

        System.out.println("Nhập số lượng môn học: ");
        int soLuong = sc.nextInt();
        Subject[] subject = new Subject[soLuong];

        for (int i = 0 ; i < soLuong; i++) {
            subject[i] = getInfoSubject();
        }

        students = new Students(nameStudent, address, age , sex, phoneNumber, id, soLuong ,subject, email);

        return students;
    }
}
