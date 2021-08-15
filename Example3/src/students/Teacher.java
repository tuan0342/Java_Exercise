package students;

public class Teacher {
    private String nameTeacher;
    private String vienQL;
    private String trinhDo;

    public Teacher(String nameTeacher, String vienQL, String trinhDo) {
        this.nameTeacher = nameTeacher;
        this.vienQL = vienQL;
        this.trinhDo = trinhDo;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getVienQL() {
        return vienQL;
    }

    public void setVienQL(String vienQL) {
        this.vienQL = vienQL;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameTeacher = '" + nameTeacher + '\'' +
                ", vienQL = '" + vienQL + '\'' +
                ", trinhDo = '" + trinhDo + '\'' +
                '}';
    }
}
