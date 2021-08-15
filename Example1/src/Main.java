import student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student;

        student = getInfoStudent();

        System.out.println("-------------------Ket qua--------------");
        System.out.println(student.toString());
        student.studyExam("Math");
        student.doExam("Java programing language");
        student.doRun("food");
    }

    public static Student getInfoStudent () {
        Student s = null;

        String fullName, address, id, numberPhone,  email;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap fullName: ");
        fullName = sc.nextLine();
        System.out.println("Nhap address: ");
        address = sc.nextLine();
        System.out.println("Nhap MSSV: ");
        id = sc.next();
        System.out.println("Nhap so dien thoai: ");
        numberPhone = sc.next();
        System.out.println("Nhap email: ");
        email = sc.next();

        s = new Student(fullName, address, email, numberPhone, id);

        return s;
    }
}
