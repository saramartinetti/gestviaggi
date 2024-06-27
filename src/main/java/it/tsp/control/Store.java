package it.tsp.control;

import it.tsp.entity.Turista;

public class Store {




    public static <T> T saveEntity(T e) {
        em.getTransaction().begin();
        T saved = em.merge(e);
        em.getTransaction().commit();
        return saved;
    }
}