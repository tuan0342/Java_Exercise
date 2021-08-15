package students;

public class Persons {
    private String namePer;
    private String address;
    private int age;
    private String sex;

    public String getNamePer() {
        return namePer;
    }

    public void setNamePer(String namePer) {
        this.namePer = namePer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Persons(String namePer, String address, int age, String sex) {
        this.namePer = namePer;
        this.address = address;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "tên ='" + namePer + '\'' +
                ", địa chỉ ='" + address + '\'' +
                ", tuổi =" + age +
                ", giới tính ='" + sex + '\'' +
                '}';
    }
}
