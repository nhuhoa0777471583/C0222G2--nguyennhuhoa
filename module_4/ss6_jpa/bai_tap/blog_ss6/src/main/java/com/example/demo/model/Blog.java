package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type_blog")
    private String typeBlog;
    @Column(name = "content_blog")
    private String contentBlog;
    @Column(name = "public_day")
    private String publicDay;

    public Blog() {
    }

    public Blog(Integer id, String typeBlog, String contentBlog, String publicDay) {
        this.id = id;
        this.typeBlog = typeBlog;
        this.contentBlog = contentBlog;
        this.publicDay = publicDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeBlog() {
        return typeBlog;
    }

    public void setTypeBlog(String typeBlog) {
        this.typeBlog = typeBlog;
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
}
