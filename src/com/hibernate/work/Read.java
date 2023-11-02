package com.hibernate.work;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.hibernate.work.dto.Employee;
import com.hibernate.work.utility.HibernateUtil;


public class Read {

	public static void main(String[] args) {
      SessionFactory sf = HibernateUtil.Connection();
      Session ses = sf.openSession();
    	ses.beginTransaction();//performs DML operation(insert,select,update,delete)
    	//Collection Framework
    	Query q =ses.createQuery("from Employee");
        List<Employee> st = q.list();  
        for(Employee e:st)
        {
        	System.out.println(e.getEmpid()+"\t"+e.getEmpname()+"\t"+e.getAge()+"\t"+e.getEmail()+"\t"+e.getMobile()+"\t"+e.getSalary()+"\t"+e.getState());
        }
        ses.getTransaction().commit();
        ses.close();
        sf.close();
	}

}
