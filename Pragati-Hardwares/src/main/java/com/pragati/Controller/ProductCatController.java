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

import com.pragati.Entity.ProductCategories;
import com.pragati.Service.ProductCatSericeImpl;

@RestController
@RequestMapping("/api")
public class ProductCatController {

	@Autowired
	private ProductCatSericeImpl productCatSericeImpl;

	
	@RequestMapping("/productcategory")
	public List<ProductCategories> Allproductscat() {

		return productCatSericeImpl.FindAll();
	}

	@RequestMapping("/productcategory/{theId}")
	public Optional<ProductCategories> getproductcatbyid(@PathVariable int theId) {

		Optional<ProductCategories> prodcat = productCatSericeImpl.FindById(theId);

		if (prodcat == null) {

			throw new RuntimeException("Product not found for id :" + theId);
		}

		return prodcat;
	}

	@PostMapping("/productcategory")
	public ProductCategories SaveProductcat(@RequestBody ProductCategories productcat) {

		productcat.setId(0);

		productCatSericeImpl.save(productcat);
		
		return productcat;
	}

	@PutMapping("/productcategory")
	public ProductCategories Updateproductcat(@RequestBody ProductCategories productcat) {

		productCatSericeImpl.save(productcat);
		
		return productcat;
	}

	@DeleteMapping("/productcategory/{theId}")
	public String Deleteproductcat(@PathVariable int theId) {

		Optional<ProductCategories> prodcat = productCatSericeImpl.FindById(theId);

		if (prodcat == null) {

			throw new RuntimeException("Product not found for id :" + theId);
		}
		productCatSericeImpl.DeletebyId(theId);
		
		return " Deleted Id :" + theId;
	}
}
