package com.pragati.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragati.Entity.ProductCategories;

@Repository
public interface ProductCatRepository extends JpaRepository<ProductCategories, Integer>{

}
