package hoa.com.repository;

import hoa.com.model.Blog;

import java.util.List;

public interface IBlogRepository {
    List<Blog> findAll();

    void save(Blog blog);

    void update(Blog blog);

    Blog findById(Integer id);

    void delete(Integer id);


}
