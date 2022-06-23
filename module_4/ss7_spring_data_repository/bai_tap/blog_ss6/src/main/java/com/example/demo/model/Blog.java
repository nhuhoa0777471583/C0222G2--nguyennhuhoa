package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "content_blog")
    private String contentBlog;
    @Column(name = "public_day", columnDefinition = "DATE")
    private String publicDay;

    @ManyToOne
    @JoinColumn(name = "id_type_blog", referencedColumnName = "id")
    private TypeBLog typeBLog;

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContentBlog() {
        return contentBlog;
    }

    public void setContentBlog(String contentBlog) {
        this.contentBlog = contentBlog;
    }

    public String getPublicDay() {
        return publicDay;
    }

    public void setPublicDay(String publicDay) {
        this.publicDay = publicDay;
    }

    public TypeBLog getTypeBLog() {
        return typeBLog;
    }

    public void setTypeBLog(TypeBLog typeBLog) {
        this.typeBLog = typeBLog;
    }
}
