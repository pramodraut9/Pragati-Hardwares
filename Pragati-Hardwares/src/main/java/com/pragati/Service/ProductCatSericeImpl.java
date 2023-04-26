package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.pragati.Entity.ProductCategories;
import com.pragati.Repository.ProductCatRepository;

@Service
public class ProductCatSericeImpl implements ProductCatService {

	@Autowired
	private ProductCatRepository productCatRepository;

	@Override
	public List<ProductCategories> FindAll() {

		return productCatRepository.findAll();

	}

	@Override
	public Optional<ProductCategories> FindById(@PathVariable int theId) {

		Optional<ProductCategories> procat = productCatRepository.findById(theId);

		if (procat == null) {

			throw new RuntimeException("Product not found");
		}
		
		return procat;
	}

	@Override
	public void save(ProductCategories productCategories) {
		
		productCatRepository.save(productCategories);

	}

	@Override
	public String DeletebyId(@PathVariable int theId) {
		
		Optional<ProductCategories> procat = productCatRepository.findById(theId);

		if (procat == null) {

			throw new RuntimeException("Product not found");
		}
		productCatRepository.deleteById(theId);
		
		return "Deleted Id :"+theId;
	}

}
