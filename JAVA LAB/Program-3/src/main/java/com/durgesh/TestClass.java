package com.durgesh;

import java.util.Scanner;

import com.durgesh.daoImp.DaoImp;

public class TestClass
{
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	DaoImp obj=new DaoImp();
	while(true)
	{
		//obj.getConnection();
		System.out.println("1.insert Data");
		System.out.println("2.Update Data");
		System.out.println("3.Dispay Data");
		System.out.println("4.Delete Data");
		System.out.println("5.Exit");
		
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			System.out.println("Enter USN:");
			String usn=sc.next();
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter Department:");
			String dept=sc.next();
			System.out.println("Enter Address:");
			String address=sc.next();
			
			obj.insertData(usn, name, address, dept);
			break;
		case 2:
			
			break;
		case 3:
			obj.fetchData();
			break;
		case 4:
			//not working
			obj.deleteData();
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Input!!");
				
		}
	}
			

}

}