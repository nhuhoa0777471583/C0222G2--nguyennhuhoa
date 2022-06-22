package bai_tap_lam_them.bai_tap_them_123.model;

public class Student extends Person {
    //lớp, điểm số
    private String classroom;
    private Integer point;

    public Student() {

    }

    public Student(Integer id, String name, String birthDay, String gener, String classroom, Integer point) {
        super(id, name, birthDay, gener);
        this.classroom = classroom;
        this.point = point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() +
                ", classroom= " + classroom +
                ", point= " + point;
    }

    public String getInfoStudent() {
        return getId() + "," + getName() + "," + getBirthDay()+ ","  +getGener()+ "," + getClassroom() + "," + getPoint();
    }
}
