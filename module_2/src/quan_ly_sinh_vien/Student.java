package tao_doi_tuong;

public class Student extends Person {
    protected int point;
    protected String school;

    public Student() {
    }

    public Student(int id, int age, String name, String address) {
        super(id, age, name, address);
    }

    public Student(int id, int age, String name, String address, int point, String school) {
        super(id, age, name, address);
        this.point = point;
        this.school = school;
    }

    void study(String subject) {
        System.out.println("mon hoc " + subject);
    }

    @Override
    void goTo() {
        System.out.println("di xe may");
    }

    @Override
    public String toString() {
        return "Student: " +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                "point=" + point +
                ", school='" + school + '\'';
    }

    public static class Text {
        public static void main(String[] args) {
            Student student = new Student(1, 18, "hoa2", "qb");
            System.out.println(student);
        }
    }
}
