package com.pragati.Service;

import java.util.List;
import java.util.Optional;


import com.pragati.Entity.Products;

public interface ProductService {

	public List<Products> FindAll();
	
	public Optional<Products>FindbyId(int theId);
	
	public void save(Products products);
	
	public String DeletebyId(int theId);
}
