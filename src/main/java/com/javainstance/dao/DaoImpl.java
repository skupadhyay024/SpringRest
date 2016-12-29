package com.javainstance.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.javainstance.model.Product;


/**
 * @author javainstance
 *
 */
@Component
public class DaoImpl {

	static ArrayList<Product> products = null;
	static {

		products = new ArrayList<>();
		Product product1 = new Product(1, "Iphone", "Iphone 6S");
		Product product2 = new Product(2, "Refrigerator", "Samsung advance cool");
		Product product3 = new Product(3, "Television", "LG Led");
		products.add(product1);
		products.add(product2);
		products.add(product3);

	}

	public Product getProduct(int productId) {

		for (Product product : products) {
			if (product.getProductId()==productId) {
				return product;
			}
		}
		return null;
	}

	public List<Product> getAllProducts() {

		return products;
	}
	

	public void addProduct(Product product) {
		
		products.add(product);
		
	}
	

}
