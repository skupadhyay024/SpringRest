package com.javainstance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainstance.dao.DaoImpl;
import com.javainstance.model.Product;

/**
 * @author javainstance
 *
 */
@RestController
public class ProductController {

	@Autowired
	private DaoImpl dao;

	@GetMapping(value = "/getAllProducts")
	public List<Product> getAllProduct() {
		List<Product> prodList = new ArrayList<>();

		prodList = dao.getAllProducts();
		return prodList;
	}

	@GetMapping("/getProduct/{productId}")
	public Product getArticleDetail(@PathVariable Integer productId) {
		Product prod = null;

		prod = dao.getProduct(productId);
		return prod;
	}

	@PostMapping(value = "/addProduct")
	public Product addProduct(@RequestBody Product product) {
		dao.addProduct(product);
		return product;

	}

}
