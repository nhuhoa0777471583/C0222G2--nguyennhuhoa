package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.BaseRepository;
import com.codegym.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(
                " select p from Product p ", Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(Integer id) {

        return BaseRepository.entityManager.find(Product.class,id);
    }

    @Override
    public void update( Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(BaseRepository.entityManager.find(Product.class, id));
        entityTransaction.commit();
    }

    @Override
    public List<Product> searchByName(String name) {
        return null;
    }
}
