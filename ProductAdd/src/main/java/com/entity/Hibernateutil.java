package com.entity;


	import org.hibernate.SessionFactory;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Configuration;

	public class Hibernateutil {
	    private static SessionFactory sessionFactory;

	    static {
	        try {
	            // Load configuration and mappings
	            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

	            // Build the SessionFactory
	            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder()
	                    .applySettings(configuration.getProperties());
	            sessionFactory = configuration.buildSessionFactory(registryBuilder.build());

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	}


