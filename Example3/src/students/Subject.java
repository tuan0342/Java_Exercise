package students;


import java.util.Arrays;

public class Subject {
    private String nameSub;
    private String maHP;
    private int soTiet;
    private int soTinChi;
    private int amountTest;
    private Teacher teacher;
    private double[] diemTungBai = new double[amountTest];
    private double diemTrungBinh;
    private int fee;

    public Subject(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public void setFee(int soTinChi) {
        this.fee = 500 * soTinChi;
    }

    public int getFee() {
        return fee;
    }

    public Subject(int amountTest, double[] diemTungBai) {
        this.amountTest = amountTest;
        this.diemTungBai = diemTungBai;
    }

    public Subject(String nameSub, String maHP, int soTiet, int soTinChi, int amountTest, Teacher teacher,
                   double[] diemTungBai, double diemTrungBinh, int fee) {
        this.nameSub = nameSub;
        this.maHP = maHP;
        this.soTiet = soTiet;
        this.soTinChi = soTinChi;
        this.amountTest = amountTest;
        this.teacher = teacher;
        this.diemTungBai = diemTungBai;
        this.diemTrungBinh = diemTrungBinh;
        this.fee = fee;
    }


    public String getNameSub() {
        return nameSub;
    }

    public void setNameSub(String nameSub) {
        this.nameSub = nameSub;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public int getAmountTest() {
        return amountTest;
    }

    public void setAmountTest(int amountTest) {
        this.amountTest = amountTest;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(int amountTest, double[] diemTungBai) {
        if (amountTest == 4) {
            this.diemTrungBinh = diemTungBai[0]/10 + diemTungBai[1] * 20/100 + diemTungBai[2] * 30/100 +
                    diemTungBai[3] * 40/100;
//            return diemTrungBinh;
        }
        if (amountTest == 3) {
            this.diemTrungBinh = diemTungBai[0] * 20/100 + diemTungBai[1] * 30/100 + diemTungBai[2] * 50/100;
//            return diemTrungBinh;
        }
        if (amountTest == 2) {
            this.diemTrungBinh = diemTungBai[0] * 30/100 + diemTungBai[1] * 70/100;
//            return  diemTrungBinh;
        }
    }

    @Override
    public String toString() {
        return "Subject{" +
                "t??n m??n h???c = '" + nameSub + '\'' +
                ", m?? h???c ph???n = '" + maHP + '\'' +
                ", s??? ti???t = " + soTiet +
                ", s??? t??n ch??? = " + soTinChi +
                ", s??? l?????ng b??i ki???m tra = " + amountTest +
                ", teacher = " + teacher +
                ", ??i???m t???ng b??i = " + Arrays.toString(diemTungBai) +
                ", ??i???m trung b??nh = " + diemTrungBinh +
                ", h???c ph?? = " + fee + " ngh??n " +
                '}' +"\n";
    }

    public void trangThaiMonHoc(double diemTrungBinh) {
        if (diemTrungBinh >= 4) {
            System.out.println("Hihi qua m??n r???i >.<");
        } else {
            System.out.println("Vc, m??n d??? th??? n??y m?? tr?????t. Ngu l???m em");
        }
    }

}
