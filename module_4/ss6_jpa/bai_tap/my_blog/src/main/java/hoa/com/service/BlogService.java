package hoa.com.service;

import hoa.com.model.Blog;
import hoa.com.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        this.iBlogRepository.update(blog);
    }

    @Override
    public Blog findById(Integer id) {
        return this.iBlogRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        this.iBlogRepository.delete(id);
    }
}
