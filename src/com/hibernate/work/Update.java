package com.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.work.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;

public class Update {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.Connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		Employee e = ses.get(Employee.class,1);
		e.setEmpname("Lil");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("Update success");
		

	}


}
