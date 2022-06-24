package com.codegym.dto;

import javax.persistence.Column;
import javax.validation.constraints.*;

public class UserDto {
    @NotEmpty(message = "cannot empty")
    @Size(min = 5, max = 45, message = "độ dài phải lớn hơn 5 và nhỏ hơn 45")
    @Pattern(regexp = "[A-Za-z]+", message = "name must be letter cannot number")
    private String firstName;

    @NotEmpty(message = "cannot empty")
    @Size(min = 5, max = 45, message = "độ dài phải lớn hơn 5 và nhỏ hơn 45")
    @Pattern(regexp = "[A-Za-z]+", message = "name must be letter cannot number")
    private String lastName;

    @NotEmpty(message = "cannot empty")
    @Pattern(regexp = "^(090)\\d{7}$", message = "phone must be ten number")
    private String phoneNumber;

    @NotEmpty(message = "cannot empty")
    @Min(value = 18, message = "cannot in 18")
    private String age;

    @NotEmpty(message = "cannot empty")
    @Email(message = "must be abc@gmail.com")
    private String emailUser;

    public UserDto() {
    }

    public UserDto(@NotEmpty(message = "cannot empty")
                   @Size(min = 5, max = 45, message = "độ dài phải lớn hơn 5 và nhỏ hơn 45")
                   @Pattern(regexp = "[A-Za-z]+", message = "name must be letter cannot number") String firstName,
                   @NotEmpty(message = "cannot empty")
                   @Size(min = 5, max = 45, message = "độ dài phải lớn hơn 5 và nhỏ hơn 45")
                   @Pattern(regexp = "[A-Za-z]+", message = "name must be letter cannot number") String lastName,
                   @NotEmpty(message = "cannot empty")
                   @Pattern(regexp = "^(090)\\d{7}$", message = "phone must be ten number") String phoneNumber,
                   @NotEmpty(message = "cannot empty") @Min(value = 18, message = "cannot in 18") String age,
                   @NotEmpty(message = "cannot empty")
    @Email(message = "must be abc@gmail.com") String emailUser) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.emailUser = emailUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }
}
