package com.codegym.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
    @JoinColumn(name = "id_category_blog", referencedColumnName = "id")
    private CategoryBlog categoryBlog;

    public Blog() {
    }

    public Blog(Integer id, String contentBlog, String publicDay, CategoryBlog categoryBlog) {
        this.id = id;
        this.contentBlog = contentBlog;
        this.publicDay = publicDay;
        this.categoryBlog = categoryBlog;
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

    public CategoryBlog getCategoryBlog() {
        return categoryBlog;
    }

    public void setCategoryBlog(CategoryBlog categoryBlog) {
        this.categoryBlog = categoryBlog;
    }
}
