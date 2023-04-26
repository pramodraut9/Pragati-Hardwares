package com.pragati.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragati.Entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer>{

}
