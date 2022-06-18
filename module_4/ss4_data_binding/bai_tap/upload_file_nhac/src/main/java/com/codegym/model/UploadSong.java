package com.codegym.model;

public class UploadSong {
    private String nameSong;
    private String nameSinger;
    private String categorySong;
    private String fileSong;

    public UploadSong(String nameSong, String nameSinger, String categorySong, String fileSong) {
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.categorySong = categorySong;
        this.fileSong = fileSong;
    }

    public UploadSong() {
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getCategorySong() {
        return categorySong;
    }

    public void setCategorySong(String categorySong) {
        this.categorySong = categorySong;
    }

    public String getFileSong() {
        return fileSong;
    }

    public void setFileSong(String fileSong) {
        this.fileSong = fileSong;
    }
}
