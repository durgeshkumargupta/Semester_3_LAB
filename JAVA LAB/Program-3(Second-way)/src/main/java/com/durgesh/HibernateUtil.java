package com.durgesh;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
// See the database in college using this command
// mysql -u 1rv20mc015 -p -h 1rv20mc015
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
		properties.put(Environment.URL,"jdbc:mysql://localhost:3306/rvce"); // "jdbc:mysql://172.16.34.105:3306/1rv20mc015"
		properties.put(Environment.PASS, "root");                          // "1rv20mc015"
		properties.put(Environment.USER,"root");                           // "1rv20mc015"
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.SHOW_SQL, true);
		properties.put(Environment.HBM2DDL_AUTO, "update");
		
		
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Student.class);
		
		sessionFactory=configuration.buildSessionFactory();
		
		return sessionFactory;
	}

}
