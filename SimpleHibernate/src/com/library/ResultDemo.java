package com.library;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.library.Books;

import com.library.Library;


public class ResultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();  
		Transaction t = s.beginTransaction();  
		
		Library l = new Library();
		l.setLibName("Akshay");
		
		Books b = new Books();
		b.setBook_Name("JungleBook");
		b.setBook_Author("Akshay");
		b.setLib(l);
		
		Books b1 = new Books();
		b1.setBook_Name("HarryPotter");
		b1.setBook_Author("Deepak");
		b1.setLib(l);
		
		Set<Books> lt = new HashSet<Books>();
		lt.add(b);
		lt.add(b1);
		
		
		l.setBooks(lt);
		
		
		
		s.save(l);
		System.out.println("Saved Sucessfully");
		
		t.commit();
		s.close();
		factory.close();
	

	}

}
