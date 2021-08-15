package student;

public class Student {
    private String fullName;
    private String address;
    private String email;
    private String numberPhone;
    private String id;

    public Student() {
    }

    public Student(String fullName, String address, String email, String numberPhone, String id) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.numberPhone = numberPhone;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public void studyExam(String subject) {
        System.out.println(this.fullName + " is studying "  + subject);
    }

    public void doExam(String subject) {
        System.out.println(this.fullName  +" do " + subject + " exam.");
    }

    public void doRun(String vehicle) {
        System.out.println(this.fullName + " go to school by " + vehicle);
    }

}
