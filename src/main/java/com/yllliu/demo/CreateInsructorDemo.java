package com.yllliu.demo;

import com.yllliu.entity.Course;
import com.yllliu.entity.Instructor;
import com.yllliu.entity.InstructorDetail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateInsructorDemo {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Instructor instructor = entityManager.find(Instructor.class, 1);
        Course course1 = new Course("Course1");
        Course course2 = new Course("Course2");
        instructor.add(course1);
        instructor.add(course2);

        entityManager.persist(course1);
        entityManager.persist(course2);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
