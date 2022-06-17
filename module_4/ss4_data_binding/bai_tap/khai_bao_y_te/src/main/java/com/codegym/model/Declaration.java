package com.codegym.model;

public class Declaration {
    private String name;
    private String birthYear;
    private String gender;
    private String nationality;
    private Integer idCard;
    private String travelInfor;
    private String idVehicle;
    private Integer seats;
    private String startDay;
    private String endDay;

    public Declaration() {
    }

    public Declaration(String name, String birthYear, String gender, String nationality, Integer idCard,
                       String travelInfor, String idVehicle, Integer seats, String startDay, String endDay) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.travelInfor = travelInfor;
        this.idVehicle = idVehicle;
        this.seats = seats;
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getTravelInfor() {
        return travelInfor;
    }

    public void setTravelInfor(String travelInfor) {
        this.travelInfor = travelInfor;
    }

    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }
}
