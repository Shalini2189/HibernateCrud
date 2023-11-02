package com.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.work.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;

public class Delete {
	
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.Connection();
		Session ses = sf.openSession();
		ses.beginTransaction();
		Employee e = ses.load(Employee.class, 7);
		ses.delete(e);
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("Deleted success");
		
		


	}


}
