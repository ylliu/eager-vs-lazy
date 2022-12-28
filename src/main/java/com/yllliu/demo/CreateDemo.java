package com.yllliu.demo;

import com.yllliu.entity.Instructor;
import com.yllliu.entity.InstructorDetail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateDemo {
    public static void main(String[] args) {
        Instructor tempInstructor = new Instructor("Chad", "Darby", "darby@qq.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://123.qq.com", "dance");
        tempInstructor.setInstructorDetail(instructorDetail);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(tempInstructor);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
