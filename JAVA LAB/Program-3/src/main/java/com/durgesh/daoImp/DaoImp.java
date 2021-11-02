package com.durgesh.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.durgesh.hibernate.config.HibernateUtil;
import com.durgesh.hibernate.model.Student;

public class DaoImp {

	public void insertData(String usn, String name, String address, String dept) {
		Student stu1 = new Student(usn, name, address, dept);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(stu1);
		session.getTransaction().commit();
		System.out.println("Data Inserted");

	}

	public void fetchData() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Student> students = query.list();
		for (Student student : students) {
			System.out.println("USN: " + student.getUsn() + ", Student Name: " + student.getName() + ", Department: "
					+ student.getDept() + " Address: " + student.getAddress());
		}
		session.getTransaction().commit();
		// sessionFactory.close();
	}

	public void updateData(String name2, String usn2) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Student student = (Student) session.get(Student.class, usn2);
		student.setName(name2);
		System.out.println("Updated Successfully");
		session.getTransaction().commit();
		// sessionFactory.close();

	}

	public void deleteData(String usn3) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student student = (Student) session.load(Student.class, usn3);
		session.delete(student);
		System.out.println("Deleted Successfully");
		session.getTransaction().commit();
		// sessionFactory.close();
	}

}
