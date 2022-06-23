package hoa.com.repository;

import hoa.com.model.Blog;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BlogRepository implements IBlogRepository {


    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> typedQuery = BaseRepository.entityManager.createQuery(
                " select b from Blog b ", Blog.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Blog blog) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(blog);
        entityTransaction.commit();
    }

    @Override
    public void update(Blog blog) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(blog);
        entityTransaction.commit();
    }

    @Override
    public Blog findById(Integer id) {
        TypedQuery<Blog> typedQuery = BaseRepository.entityManager.createQuery(
                " select b from Blog b where b.id= :id ", Blog.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getSingleResult();
    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(BaseRepository.entityManager.find(Blog.class, id));
        entityTransaction.commit();
    }
}
