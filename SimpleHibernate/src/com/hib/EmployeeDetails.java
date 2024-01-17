package com.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class EmployeeDetails {
public static void main(String[] args) {
	
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();  
	Transaction t = session.beginTransaction();   
	            
	/*
	 * Employee e1=new Employee(); //e1.setEmpId(1); e1.setName("Pavan");
	 * e1.setSalary(200000);
	 * 
	 * session.save(e1); t.commit(); System.out.println("successfully saved");
	 */
	    
		
		  Criteria c = session.createCriteria(Employee.class);
		  c.add(Restrictions.gt("Salary",(double)200000));
		  
		  List<Employee> l = c.list();
		  
		  
		  for(Employee emp:l) {
		  
		  System.out.println(emp);
		  
		  }
		  session.close();  	    
	    factory.close();  
	     
}
}
