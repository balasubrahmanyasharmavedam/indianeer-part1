package com.subbu.happycartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subbu.happycartbackend.dao.ProductDAO;
import com.subbu.happycartbackend.model.Category;
import com.subbu.happycartbackend.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.subbu.happycartbackend");
		context.refresh();

		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product = (Product) context.getBean("product");
		
		product.setCategory_id("cat2");
		product.setBrand("sony");
		product.setId("pro3");
		product.setModel("z3");
		product.setPrice("50,000");
		
		productDAO.saveOrUpdate(product);
		
		
		System.out.println("No.of products available" + productDAO.list().size());

		if (productDAO.get("sdfsf") == null) {
			System.out.println("Products available..the stock is shown in database..");
			System.out.println();
		}

	}

}
