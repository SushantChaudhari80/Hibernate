package com.sushant.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Users u=new Users("SUSHCHAU","Sushant Chaudhari","Ahmednagar");
        Configuration con=new Configuration().configure().addAnnotatedClass(Users.class);
      //  ServiceRegistry reg=new ServiceRegistryBuilder().applySetting(con.getProperty(null), con).buildServiceRegistry();
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();
        session.save(u);
    }
}