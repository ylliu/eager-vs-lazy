package com.yllliu.demo;

import com.yllliu.entity.Course;
import com.yllliu.entity.Instructor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetInstructorCourseDemo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Instructor instructor = entityManager.find(Instructor.class, 1);
        System.out.println(instructor.getCourses());
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
