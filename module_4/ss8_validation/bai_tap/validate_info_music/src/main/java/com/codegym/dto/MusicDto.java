package com.codegym.dto;

import com.codegym.validation.Author;

import javax.validation.GroupSequence;
import javax.validation.constraints.*;


@GroupSequence(value = {MusicDto.class, BasicInfo.class, AdvanceInfo.class})
public class MusicDto {

    @NotBlank(message = "ko đc để trống", groups = BasicInfo.class)
    @Size(max = 800, message = "ko đc quá 800")

    @Pattern(regexp = "^(\\p{L}|\\d|,)+((\\p{L}|\\d|,)+)*$",
            groups = AdvanceInfo.class,
            message = "tên ko chứa kí tự đặc biệt")

    @Author
    private String nameMusic;


    @NotBlank(message = "ko đc để trống", groups = BasicInfo.class)
    @Size(max = 800, message = "ko đc quá 800")
    @Pattern(regexp = "^(\\p{L}|\\d|,)+( (\\p{L}|\\d|,)+)*$", groups = AdvanceInfo.class, message = "tên ko chứa kí tự đặc biệt")
    private String singger;


    @NotBlank(message = "ko đc để trống", groups = BasicInfo.class)
    @Size(max = 800, message = "ko đc quá 800")
    @Pattern(regexp = "^(\\p{L}|\\d|,)+( (\\p{L}|\\d|,)+)*$",  groups = AdvanceInfo.class, message = "tên ko chứa kí tự đặc biệt")
    private String typeMusic;



    public MusicDto(@NotBlank(message = "ko đc để trống", groups = BasicInfo.class) @Size(max = 800, message = "ko đc quá 800") @Pattern(regexp = "^(\\p{L}|\\d|,)+( (\\p{L}|\\d|,)+)*$",
            groups = AdvanceInfo.class,
            message = "tên ko chứa kí tự đặc biệt") String nameMusic, @NotBlank(message = "ko đc để trống", groups = BasicInfo.class) @Size(max = 800, message = "ko đc quá 800") @Pattern(regexp = "^(\\p{L}|\\d|,)+( (\\p{L}|\\d|,)+)*$", message = "tên ko chứa kí tự đặc biệt") String singger, @NotBlank(message = "ko đc để trống", groups = BasicInfo.class) @Size(max = 800, message = "ko đc quá 800") @Pattern(regexp = "^(\\p{L}|\\d|,)+( (\\p{L}|\\d|,)+)*$", groups = AdvanceInfo.class, message = "tên ko chứa kí tự đặc biệt") String typeMusic) {
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
