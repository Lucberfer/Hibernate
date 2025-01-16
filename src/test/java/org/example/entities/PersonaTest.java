package org.example.entities;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    void createTablesTest(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();


        /*session.beginTransaction();
        session.createQuery("create table Persona").executeUpdate();
        session.getTransaction().commit();
        session.close();*/
    }

    @Test
    void createTableTest2(){
    }

}