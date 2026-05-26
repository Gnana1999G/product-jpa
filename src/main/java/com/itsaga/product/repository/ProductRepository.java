package com.itsaga.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsaga.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
