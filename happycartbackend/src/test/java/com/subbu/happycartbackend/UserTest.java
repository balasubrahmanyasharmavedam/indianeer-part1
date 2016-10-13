package com.subbu.happycartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subbu.happycartbackend.dao.UserDAO;
import com.subbu.happycartbackend.model.User;



public class UserTest {
	
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.subbu.happycartbackend");
		context.refresh();
		
		UserDAO userDAO =(UserDAO) context.getBean("userDAO");
		User user= (User) context.getBean("user");
		user.setId("001");
		user.setUsername("subramanyam");
		user.setPassword("sharma101");
		user.setEmail("subramanyasharma101@gmail.com");
		user.setMobilenumber("+91 8790076737");
		user.setRole("1");
		
		userDAO.saveOrUpdate(user);
		
		if(userDAO.get("sdfsf")==null)
		{
			System.out.println("SignedUp users are displayed on h2 database...");
			System.out.println();
		}
		
	}

}
