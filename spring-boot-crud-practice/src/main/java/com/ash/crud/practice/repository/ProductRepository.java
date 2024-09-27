package com.ash.crud.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ash.crud.practice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);
	
}
