package com.durgesh;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class Test 
{
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
//		System.out.println("_____________Insert Data____________________");
//		Student student=new Student(5,"Suman","MCA");
//		session.save(student);
//		
//		session.getTransaction().commit();
//		System.out.println("Data Insert");
//		
		
//		
//		System.out.println("________________Update Data_______________");
//		
//		Student student2=session.get(Student.class, 5);
//		student2.setName("Aman");
//		
//		session.getTransaction().commit();
//		System.out.println("Data Update");
		
		
//		System.out.println("__________________Delete Data__________________");
//		Student s2=session.load(Student.class, 0);
//		
//		session.delete(s2);
//		
//		session.getTransaction().commit();
//		System.out.println("Data Deleted");
		
		
		System.out.println("________________Display Data________________");
		Query query=session.createQuery("from Student");
		List<Student> l=query.list();
		for(Student s:l)
		{
			System.out.println("ID:" +s.getId()+" Name:"+s.getName()+" Department :"+s.getDept());
		}
		//session.getTransaction().commit();
		
		
		
	}

}
