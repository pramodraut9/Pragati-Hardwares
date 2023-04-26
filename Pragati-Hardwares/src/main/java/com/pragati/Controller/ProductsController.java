package com.pragati.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pragati.Entity.Products;
import com.pragati.Service.ProductsServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductsController {

	@Autowired
	private ProductsServiceImpl productsServiceImpl;
	
	
	@RequestMapping("/products")
	public List<Products> Allproducts() {

		return productsServiceImpl.FindAll();
	}

	
	@RequestMapping("/products/{theId}")
	public Optional<Products> getproductbyid(@PathVariable int theId) {

		Optional<Products> product = productsServiceImpl.FindbyId(theId);

		if (product == null) {

			throw new RuntimeException("Product not found for id :" + theId);
		}

		return product;
	}

	
	@PostMapping("/products")
	public void SaveProduct(@RequestBody Products product) {

		product.setId(0);

		productsServiceImpl.save(product);
	}

	
	@PutMapping("/products")
	public Products Updateproduct(@RequestBody Products product) {

		productsServiceImpl.save(product);
		
		return product;
	}

	
	@DeleteMapping("/products/{theId}")
	public String Deleteproduct(@PathVariable int theId) {

		Optional<Products> prod = productsServiceImpl.FindbyId(theId);

		if (prod == null) {

			throw new RuntimeException("Product not found for id :" + theId);
		}
		productsServiceImpl.DeletebyId(theId);
		
		return " Deleted Id :" + theId;
	}
}
