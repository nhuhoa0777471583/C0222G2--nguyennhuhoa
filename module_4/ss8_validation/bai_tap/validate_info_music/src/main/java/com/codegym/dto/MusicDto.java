package com.codegym.dto;

import javax.validation.constraints.*;

public class MusicDto {
    @NotEmpty(message = "ko đc để trống")
    @Size(min = 0,max= 800, message = "ko đc quá 800")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "tên ko chứa kí tự đặc biệt")
    private String nameMusic;

    @NotEmpty(message = "ko đc để trống")
    @Size(min = 0,max= 800, message = "ko đc quá 800")

    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "tên ko chứa kí tự đặc biệt")
    private String singger;

    @NotEmpty(message = "ko đc để trống")
    @Size(min = 0,max= 800, message = "ko đc quá 800")

    @Pattern(regexp = "^[A-Za-z0-9,]+$", message = "tên ko chứa kí tự đặc biệt (ngoại trừ dấu ,)")
    private String typeMusic;

    public MusicDto(@NotEmpty(message = "ko đc để trống")
                    @Size(min = 0, max = 800, message = "ko đc quá 800")
                    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "tên ko chứa kí tự đặc biệt") String nameMusic,
                    @NotEmpty(message = "ko đc để trống")
                    @Size(min = 0, max = 800, message = "ko đc quá 800")
                    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "tên ko chứa kí tự đặc biệt") String singger,
                    @NotEmpty(message = "ko đc để trống")
                    @Size(min = 0, max = 800, message = "ko đc quá 800")
                    @Pattern(regexp = "^[A-Za-z0-9,]+$", message = "tên ko chứa kí tự đặc biệt (ngoại trừ dấu ,)") String typeMusic) {
        this.nameMusic = nameMusic;
        this.singger = singger;
        this.typeMusic = typeMusic;
    }

    public MusicDto() {
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getSingger() {
        return singger;
    }

    public void setSingger(String singger) {
        this.singger = singger;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }
}
