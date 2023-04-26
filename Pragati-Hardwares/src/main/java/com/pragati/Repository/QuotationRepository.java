package com.pragati.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragati.Entity.Quotation;
@Repository
public interface QuotationRepository extends JpaRepository<Quotation, Integer>{

}
