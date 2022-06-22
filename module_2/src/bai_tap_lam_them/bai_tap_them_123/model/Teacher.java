package bai_tap_lam_them.bai_tap_them_123.model;

public class Teacher extends Person {
    private String level;

    public Teacher() {

    }

    public Teacher(Integer id, String name, String birthDay, String gener, String level) {
        super(id, name, birthDay, gener);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString() +
                ", level= " + level;
    }

    public String getInfoTeacher() {
        return getId() + "," + getName() + "," + getBirthDay() + "," + getGener() + "," + getLevel();
    }
}
