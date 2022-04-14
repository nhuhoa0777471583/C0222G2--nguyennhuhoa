package tao_doi_tuong;

public class Person {
    protected int id;
    protected int age;
    protected String name;
    protected String address;

    public Person() {
    }

    public Person(int id, int age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void goTo() {
        System.out.println("di bo");
    }

    @Override
    public String toString() {
        return "Person: " +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'';
    }

    public static class Text {
        public static void main(String[] args) {
            Person person= new Person(5,10,"hoa","dn");
            System.out.println(person);
        }
    }
}
