package model.employee;

public class Divition {
    private Integer idDivition;
    private String nameDivition;

    public Divition() {
    }

    public Divition(Integer idDivition, String nameDivition) {
        this.idDivition = idDivition;
        this.nameDivition = nameDivition;
    }

    public Integer getIdDivition() {
        return idDivition;
    }

    public void setIdDivition(Integer idDivition) {
        this.idDivition = idDivition;
    }

    public String getNameDivition() {
        return nameDivition;
    }

    public void setNameDivition(String nameDivition) {
        this.nameDivition = nameDivition;
    }
}
