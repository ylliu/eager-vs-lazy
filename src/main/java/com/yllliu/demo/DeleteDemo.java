package com.yllliu.demo;

import com.yllliu.entity.Instructor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteDemo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Instructor instructor = entityManager.find(Instructor.class, 1);

        if (instructor != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(instructor);
            System.out.println("remove instructor:" + instructor.toString());
        }

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
