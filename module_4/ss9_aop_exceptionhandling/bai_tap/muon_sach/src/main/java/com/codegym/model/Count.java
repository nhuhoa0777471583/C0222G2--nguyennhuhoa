package com.codegym.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Count {
    @Id
    private Integer id;
    @Column(name = "count_view")
    private Integer countView;

    public Count() {
    }

    public Count(Integer id, Integer countView) {
        this.id = id;
        this.countView = countView;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountView() {
        return countView;
    }

    public void setCountView(Integer countView) {
        this.countView = countView;
    }
}
