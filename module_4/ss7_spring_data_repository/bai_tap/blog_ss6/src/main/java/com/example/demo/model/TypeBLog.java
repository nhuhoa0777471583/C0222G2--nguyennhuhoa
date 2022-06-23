package com.example.demo.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_blog")
public class TypeBLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    @Column(name = "name_type_blog")
    private String nameTypeBlog;

    @OneToMany(mappedBy = "typeBLog")
    private List<Blog> blogList;



    public Integer getId() {
        return id;
    }

    public void setId(Integer idTypeBlog) {
        this.id = idTypeBlog;
    }

    public String getNameTypeBlog() {
        return nameTypeBlog;
    }

    public void setNameTypeBlog(String nameTypeBlog) {
        this.nameTypeBlog = nameTypeBlog;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}
