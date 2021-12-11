
package com.proyectojava;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Idaira
 */
public class Main {
    public static void main(String[] args) {
        /*SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        
        Alumnos alumno = new Alumnos("Gates","99999999","Empresario","Bill");
        
        session.beginTransaction();
        session.save(alumno);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();*/
        
        Alumnos alumno1 = new Alumnos("Garcia","27272727","Informatica","Eduardo");
        Alumnos alumno2 = new Alumnos("Muñoz","11111111","Historia","Cristina");
        
        AlumnosDAO crud = new AlumnosDAO();
        
        crud.crear(alumno1);
        crud.crear(alumno2);
        crud.mostrarTodos();
        alumno2.setDni("99999999");
        crud.update(alumno2);
        System.out.println("Buscar por ID:"+ crud.buscarID(2));
        crud.delete(alumno2);
        crud.mostrarTodos();
    }
}
