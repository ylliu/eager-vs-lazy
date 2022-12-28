package com.yllliu.demo;

import com.yllliu.entity.InstructorDetail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetInstructorDetailDemo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, 2);

        System.out.println("instructorDetail:"+instructorDetail.toString());
        System.out.println("instructor:"+instructorDetail.getInstructor().toString());

        entityManager.close();
        entityManagerFactory.close();
    }
}
