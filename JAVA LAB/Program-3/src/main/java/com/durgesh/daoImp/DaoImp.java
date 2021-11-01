package com.durgesh.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.durgesh.hibernate.config.HibernateUtil;
import com.durgesh.hibernate.model.Student;

public class DaoImp 
{
	
	public void getConnection()
	{
		 Transaction transaction = null;
	        try(Session session = HibernateUtil.getSessionFactory().openSession()){
	            transaction =  session.beginTransaction();
	        }
	            catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public void insertData(String usn,String name,String address,String dept)
	{
		Student stu1=new Student(usn,name,address,dept);
		
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction =  session.beginTransaction();

            session.save(stu1);
            transaction.commit();
            System.out.println("Data Inserted");
        }catch (Exception e){
            e.printStackTrace();
        }

	}

	public void fetchData() 
	{
	
		  //Create session factory object
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  Query query = session.createQuery("from Student");
		  List<Student> students = query.list();
		  for(Student student : students)
		  {
		System.out.println("USN: "+student.getUsn()+", Student Name: "+student.getName()+", Department: "+student.getDept()+" Address: "+student.getAddress());
		  }
		  session.getTransaction().commit();
		//  sessionFactory.close();
		 }

	public void deleteData() {
		 Session session = null;
	      Transaction transaction = null;
		session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.getTransaction();
        transaction.begin();

        //Delete a persistent object
        Student customer1=session.get(Student.class, 2L);
        if(customer1!=null){
           session.delete(customer1);
           System.out.println("Student 1 is deleted");
        }
		
	}
	
}
