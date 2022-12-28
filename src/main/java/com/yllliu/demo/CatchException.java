package com.yllliu.demo;

import com.yllliu.entity.InstructorDetail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CatchException {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, 2222);

            System.out.println("instructorDetail:" + instructorDetail.toString());
            System.out.println("instructor:" + instructorDetail.getInstructor().toString());

        } catch (Exception e) {
            System.out.println("exception here");
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
