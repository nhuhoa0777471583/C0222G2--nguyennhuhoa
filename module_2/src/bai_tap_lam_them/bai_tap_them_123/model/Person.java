package bai_tap_lam_them.bai_tap_them_123.model;

public abstract class Person {
    //Mã, tên, ngày sinh, giới tính
    private Integer id;
    private String name;
    private String birthDay;
    private String gener;

    public Person() {
    }

    public Person(Integer id, String name, String birthDay, String gener) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gener = gener;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    @Override
    public String toString() {
        return "id= " + id +
                ", name= " + name +
                ", birthDay= " + birthDay +
                ", gener= " + gener ;
    }
}
