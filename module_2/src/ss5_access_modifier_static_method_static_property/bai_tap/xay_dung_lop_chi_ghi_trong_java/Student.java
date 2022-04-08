package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "Join";
    private String classes = "C02";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
            this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +super.toString();

    }

    public static void main(String[] args) {
        Student student =new Student();
        student.setName("hoa");
        student.setClasses("C0222");
        System.out.println(student.toString());
    }
}