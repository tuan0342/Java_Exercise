package students;

import java.util.Arrays;

public class Students extends Persons {

    private String phoneNumber;
    private String id;
    private int soLuongMonHoc;
    private Subject[] subject = new Subject[soLuongMonHoc];
    private String email;

    public Students(String namePer, String address, int age, String sex, String phoneNumber, String id,
                    int soLuongMonHoc ,Subject[] subject, String email) {
        super(namePer, address, age, sex);
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.soLuongMonHoc = soLuongMonHoc;
        this.subject = subject;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Subject[] getSubject() {
        return subject;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public int getSoLuongMonHoc() {
        return soLuongMonHoc;
    }

    public void hienThiTrangThaiHocTap(Subject[] subject, int soLuongMonHoc) {
        for (int i = 0 ; i < soLuongMonHoc; i++) {
            System.out.print(subject[i].getNameSub() + " ");
            double diemTrungBinh = subject[i].getDiemTrungBinh();
            subject[i].trangThaiMonHoc(diemTrungBinh);
        }
    }

    public void setSoLuongMonHoc(int soLuongMonHoc) {
        this.soLuongMonHoc = soLuongMonHoc;
    }



    @Override
    public String toString() {
        return "Sinh viên : " + getNamePer() +
                ", địa chỉ: " + getAddress() +
                ", tuổi: " + getAge() +
                ", giới tính: " + getSex() +
                ", email: " + email  +
                ", số điện thoại: " + phoneNumber +
                ", Mã số sinh viên: " + id +
                "\n" +
                ", thông tin môn học: " + Arrays.toString(subject) +
                "\n";
    }
}
