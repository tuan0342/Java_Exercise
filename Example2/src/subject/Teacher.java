package subject;

public class Teacher {
    private String name;
    private String vien;
    private String trinhDo;

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVien() {
        return vien;
    }

    public void setVien(String vien) {
        this.vien = vien;
    }

    public Teacher() {
    }

    public Teacher(String name, String vien, String trinhDo) {
        this.name = name;
        this.vien = vien;
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", vien='" + vien + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                '}';
    }
}
