package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragati.Entity.Products;
import com.pragati.Repository.ProductRepository;

@Service
public class ProductsServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public List<Products> FindAll() {
		
		return productRepository.findAll();
	}

	@Override
	public Optional<Products> FindbyId(int theId) {
		
		Optional<Products>products =productRepository.findById(theId);
		
		if(products == null) {
			
			throw new RuntimeException("Product not found");
		}
		
		return products;
	}

	@Override
	public void save(Products products) {
		
		productRepository.save(products);
		
	}

	@Override
	public String DeletebyId(int theId) {
		
	Optional<Products>products =productRepository.findById(theId);
		
		if(products == null) {
			
			throw new RuntimeException("Product not found");
		}
		productRepository.deleteById(theId);
		
		return " Deleted id :"+theId;
	}

}
