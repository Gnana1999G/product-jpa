package com.itsaga.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsaga.product.model.Product;
import com.itsaga.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping
	public Product addProduct(@RequestBody Product prod) {
		return service.addProduct(prod);
	}
	
	@GetMapping
	public List<Product> showAllProducts(){
		return service.showAllProducts();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> showProduct(@PathVariable int id) {
		return service.showProduct(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProduct(@PathVariable int id,@RequestBody Product prod) {
		Product updated= service.updateProduct(id, prod);
		if(updated != null) {
			return ResponseEntity.ok(updated);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
		}
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable int id) {
		service.removeProductById(id);
	}

}
