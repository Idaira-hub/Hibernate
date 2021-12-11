
package com.proyectojava;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Idaira
 */
public class AlumnosDAO {
    
    public Alumnos buscarID(int id){
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        Alumnos alumno = (Alumnos)session.get(Alumnos.class,id);
        session.close();
        sessionFactory.close();
        return alumno;
    }
    
    public void mostrarTodos(){
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        List<Alumnos> alumnos = session.createCriteria(Alumnos.class).list();
        session.close();
        sessionFactory.close();
        
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
    }
    
    public void crear(Alumnos alumno){
       SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.save(alumno);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close(); 
    }
    
    public void update(Alumnos alumno){
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.merge(alumno);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    
    public void delete(Alumnos alumno){
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        session.delete(alumno);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
