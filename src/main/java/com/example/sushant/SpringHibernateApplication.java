package com.example.sushant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sushant.DAO.Emp;

@SpringBootApplication
public class SpringHibernateApplication {

	private static final Object String = null;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApplication.class, args);
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Emp.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
//		SpringHibernateApplication.save(session, new Emp("SUSHCHAU","Sushant chaudhari","Ahmedmagar"));
//		SpringHibernateApplication.save(session, new Emp("54565","Prashant chaudhari","Ahmedmagar"));
//		SpringHibernateApplication.save(session, new Emp("ADIMSHAI","Adim Shaik","Aurangabad"));
//		SpringHibernateApplication.get(session, "SUSHCHAU");
//		SpringHibernateApplication.delete(session, "SUSHCHAU");
		SpringHibernateApplication.update(session, "SUSHCHAU");
		
		
		tr.commit();

	}
	
	public static void get(Session session,String id) {
		Emp e=session.get(Emp.class, id);
		System.out.println(e.toString());
	}
	public static void save(Session session,Emp e) {
		try {
		session.save(e);
		System.out.println("Data Saved Successfully..");
		}
		catch(Exception exception) {
			System.out.println(""+exception);
		}
	}
	public static void delete(Session session,String id) {
		try {
		session.delete(id, Emp.class);
		}catch(Exception e) {
			System.out.println(""+e);
		}
	}
	public static void update(Session session,String id) {
		try {
		Emp e=session.get(Emp.class, id);
		e.setName("REPLACED DATA");
		e.setAddress("REPLACED DATA");
		session.save(e);
		System.out.println("Data Updates Successfully...");
		}catch(Exception e) {
			System.out.println(""+e);
		}
	}
	

}
