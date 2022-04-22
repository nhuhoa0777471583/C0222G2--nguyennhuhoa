package ss16_io_text_file.thuc_hanh.test;

public class Student {
    private String name;
    private Integer age;
    private String adderss;

    public Student() {
    }

    public Student(String name, Integer age, String adderss) {
        this.name = name;
        this.age = age;
        this.adderss = adderss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    @Override
    public String toString() {
        return  name + ';' + age +';'+ adderss;
    }
}
