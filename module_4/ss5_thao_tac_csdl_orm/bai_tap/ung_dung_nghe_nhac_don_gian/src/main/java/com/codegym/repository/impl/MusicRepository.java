package com.codegym.repository.impl;

import com.codegym.model.Music;
import com.codegym.repository.BaseRepository;
import com.codegym.repository.IMusicRepository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class MusicRepository implements IMusicRepository {
    @Override
    public List<Music> findAll() {
        TypedQuery<Music> typedQuery =
                BaseRepository.entityManager.createQuery(
                        " select m from Music m ", Music.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(music);
        entityTransaction.commit();
    }

    @Override
    public Music findById(Integer id) {
        TypedQuery<Music> typedQuery = BaseRepository.entityManager.createQuery(
                " select m from Music m where m.id = :id ", Music.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getSingleResult();
    }

    @Override
    public void update(Music music) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(music);
        entityTransaction.commit();

    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(BaseRepository.entityManager.find(Music.class, id));
        entityTransaction.commit();
    }
}
