package com.entity;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	import com.entity.student;

	public class main {

		public static void main(String[] args) {
			Configuration  cfg= new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			
			Session session = sf.openSession();
			Transaction trans = session.beginTransaction();
			
			student std = new student();
			std.setRollno(1002);
			std.setStdname("aditya");
			std.setCourse("Java");
			std.setFees(15000.00f);
			
			session.save(std);
			trans.commit();
			
			session.close();
			sf.close();
		System.out.println(" Inserted Row.....");
		}
	}


