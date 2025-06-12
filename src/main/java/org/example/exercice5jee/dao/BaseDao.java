package org.example.exercice5jee.dao;



import org.hibernate.Session;

import java.util.List;

public abstract class BaseDao<T> {
    
    protected Session session;

    public BaseDao(Session session) {
        this.session = session;
    }

    public T save (T T){
        session.beginTransaction();
        session.persist(T);
        session.getTransaction().commit();
        return T;
    }
    public T update (T T){
        session.beginTransaction();
        session.merge(T);
        session.getTransaction().commit();
        return T;
    }
    public boolean delete (T T){
        session.beginTransaction();
        session.remove(T);
        session.getTransaction().commit();
        return true;
    }

    public abstract T get (int id);

    public abstract List<T> get ();

}
