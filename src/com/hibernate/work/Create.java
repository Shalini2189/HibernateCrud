package com.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.work.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;

public class Create {
	public static void main(String[] args) {
		Employee e = new Employee();
        e.setEmpid(1);
        e.setEmpname("Shaluu");
        e.setAge(18);
        e.setEmail("@shal123");
        e.setMobile(87578);
        e.setSalary(45000);
        e.setState("Karnataka");
        //calling Hibernate Util java class
        SessionFactory sf = HibernateUtil.Connection();
        Session ses = sf.openSession();
        ses.beginTransaction();
        ses.save(e);
        System.out.println("Table created success and record insert success");
        ses.close();
        sf.close(); 
	}
}
