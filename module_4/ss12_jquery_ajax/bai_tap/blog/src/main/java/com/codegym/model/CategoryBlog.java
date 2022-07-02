package com.codegym.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category_blog")
public class CategoryBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_category_blog")
    private String nameCategoryBlog;
    @JsonBackReference
    @OneToMany(mappedBy = "categoryBlog")
    private List<Blog> blogList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer idTypeBlog) {
        this.id = idTypeBlog;
    }

    public String getNameCategoryBlog() {
        return nameCategoryBlog;
    }

    public void setNameCategoryBlog(String nameCategoryBlog) {
        this.nameCategoryBlog = nameCategoryBlog;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}
