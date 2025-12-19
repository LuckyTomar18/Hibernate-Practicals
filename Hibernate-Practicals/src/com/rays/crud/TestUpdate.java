package com.rays.crud;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.rays.user.UserDTO;

public class TestUpdate {

	public static void main(String[] args) {
		
		UserDTO dto = new UserDTO();
		dto.setId(2);
		dto.setFirstName("lucky");
		dto.setLastName("Tomar");
		dto.setLoginId("lucky@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("Gurgaon");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.update(dto);
		
		tx.commit();
		
		session.close();
		
	}
}
