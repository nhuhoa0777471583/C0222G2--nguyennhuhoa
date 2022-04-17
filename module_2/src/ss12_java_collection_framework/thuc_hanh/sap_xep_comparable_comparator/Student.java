package ss12_java_collection_framework.thuc_hanh.sap_xep_comparable_comparator;

public class Student implements Comparable<Student> {
    public String name;
    public int age;
    public String address;
    public Student(){}
    public Student(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name= " + name + '\'' +
                ", age= " + age +
                ", address=  " + address;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
