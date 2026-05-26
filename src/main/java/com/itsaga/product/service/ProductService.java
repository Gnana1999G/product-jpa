package com.itsaga.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itsaga.product.model.Product;
import com.itsaga.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public Product addProduct(Product prod) {
		return repo.save(prod);
	}
	public List<Product> showAllProducts(){
		return repo.findAll();
	}
	public Optional<Product> showProduct(int id) {
		return repo.findById(id);
	}
	public Product updateProduct(int id,Product prod) {
		Product existing=repo.findById(id).orElse(null);
		if(existing != null) {
			existing.setName(prod.getName());
			existing.setPrice(prod.getPrice());
			existing.setQuantity(prod.getQuantity());
			
			return repo.save(existing);
		}
		return null;
	}
	public void removeProductById(int id) {
		 repo.deleteById(id);
	}

}
