package ss5_access_modifier_static_method_static_property.thuc_hanh;

public class StaticMethodStudent {
    private int num;
    private String name;
    private static String college = "BBDIT";

    StaticMethodStudent(int r, String n) {
        num = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(num + " " + name + " " + college);
    }
}

class TestStaticMethodStudent {
    public static void main(String[] args) {
        StaticMethodStudent.change();
        StaticMethodStudent s1 = new StaticMethodStudent(111, "nguyen");
        StaticMethodStudent s2 = new StaticMethodStudent(222, "nhu");
        StaticMethodStudent s3 = new StaticMethodStudent(333, "hoa");
        s1.display();
        s2.display();
        s3.display();
    }
}