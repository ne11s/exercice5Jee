package org.example.exercice5jee.dao;

import org.example.exercice5jee.models.Dog;
import org.hibernate.Session;

import java.util.List;

public class DogDao extends BaseDao<Dog> {

    public DogDao(Session session) {
        super(session);
    }

    @Override
    public Dog get(int id) {
        return session.get(Dog.class,id);
    }

    @Override
    public List<Dog> get() {
        return session.createQuery("select p from Dog p", Dog.class).getResultList();
    }
}
