package model.employee;

public class Education {
    private Integer idEducation;
    private String nameEducation;

    public Education(Integer idEducation, String nameEducation) {
        this.idEducation = idEducation;
        this.nameEducation = nameEducation;
    }

    public Education() {
    }

    public Integer getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(Integer idEducation) {
        this.idEducation = idEducation;
    }

    public String getNameEducation() {
        return nameEducation;
    }

    public void setNameEducation(String nameEducation) {
        this.nameEducation = nameEducation;
    }
}
