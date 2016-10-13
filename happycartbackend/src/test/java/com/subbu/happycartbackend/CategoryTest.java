package com.subbu.happycartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subbu.happycartbackend.dao.CategoryDAO;
import com.subbu.happycartbackend.model.Category;
import com.subbu.happycartbackend.model.Product;

public class CategoryTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.subbu.happycartbackend");
		context.refresh();

		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
	
		
		
	

		if (categoryDAO.get("sdfsf") == null) {
			System.out.println("Category exist..the detials are..");
			System.out.println();
		}

	}

}
