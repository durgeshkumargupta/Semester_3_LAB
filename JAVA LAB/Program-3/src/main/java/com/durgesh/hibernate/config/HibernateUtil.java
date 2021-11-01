package com.durgesh.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.durgesh.hibernate.model.Student;


public class HibernateUtil 
{
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		if(null!=sessionFactory)
			return sessionFactory;
		
		
		Configuration configuration=new Configuration();
		Properties properties=new Properties();
		 properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
	        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/rvce_lab?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
	        properties.put(Environment.USER, "root");
	        properties.put(Environment.PASS, "");
	        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
	        properties.put(Environment.SHOW_SQL, "true");
	        properties.put(Environment.HBM2DDL_AUTO, "update");

	        configuration.setProperties(properties);
	        configuration.addAnnotatedClass(Student.class);

	        sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}
}
