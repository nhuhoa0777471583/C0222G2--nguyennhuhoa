package model.customer;

public class CustomerType {
    private Integer idCustomerType ;
    private String nameCustomerType;

    public CustomerType() {
    }

    public CustomerType(Integer idCustomerType, String nameCustomerType) {
        this.idCustomerType = idCustomerType;
        this.nameCustomerType = nameCustomerType;
    }

    public Integer getIdCustomerType() {
        return idCustomerType;
    }

    public void setId(Integer idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getNameCustomerType() {
        return nameCustomerType;
    }

    public void setNameCustomerType(String nameCustomerType) {
        this.nameCustomerType = nameCustomerType;
    }
}
