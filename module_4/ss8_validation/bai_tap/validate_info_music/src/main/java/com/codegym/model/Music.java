package com.codegym.model;

import javax.persistence.*;

@Entity
public class Music {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_music")
    private String nameMusic;
    private String singger;
    @Column(name = "type_music")
    private String typeMusic;

    public Music() {
    }

    public Music(Integer id, String nameMusic, String singger, String typeMusic) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.singger = singger;
        this.typeMusic = typeMusic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
