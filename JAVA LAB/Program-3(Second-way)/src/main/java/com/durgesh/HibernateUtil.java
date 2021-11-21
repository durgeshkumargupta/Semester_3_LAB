package com.durgesh;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory !=null)
			return sessionFactory;
		 
		Configuration configuration=new Configuration();
		Properties properties=new Properties();
		
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL,"jdbc:mysql://localhost:3306/rvce");
		properties.put(Environment.PASS, "root");
		properties.put(Environment.USER,"root");
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.SHOW_SQL, true);
		properties.put(Environment.HBM2DDL_AUTO, "update");
		
		
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Student.class);
		
		sessionFactory=configuration.buildSessionFactory();
		
		return sessionFactory;
	}

}
