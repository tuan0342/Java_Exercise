package subject;

public class Subject {
    private String nameSub;
    private String id;
    private int soTiet;
    private int tinChi;
    private Teacher teacher;

    public Subject() {
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameSub='" + nameSub + '\'' +
                ", id='" + id + '\'' +
                ", soTiet=" + soTiet +
                ", tinChi=" + tinChi +
                ", teacher=" + teacher +
                '}';
    }

    public Subject(String nameSub, String id, int soTiet, int tinChi, Teacher teacher) {
        this.nameSub = nameSub;
        this.id = id;
        this.soTiet = soTiet;
        this.tinChi = tinChi;
        this.teacher = teacher;
    }

    public String getNameSub() {
        return nameSub;
    }

    public void setNameSub(String nameSub) {
        this.nameSub = nameSub;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void comment(String commentFromStudent) {
        System.out.println(commentFromStudent);
    }
}
