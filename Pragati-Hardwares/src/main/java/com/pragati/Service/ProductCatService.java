package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import com.pragati.Entity.ProductCategories;


public interface ProductCatService {

   public List<ProductCategories>FindAll();
   
   public Optional<ProductCategories>FindById(int theId);
   
   public void save(ProductCategories productCategories);
	
   public String DeletebyId(int theId);
}
