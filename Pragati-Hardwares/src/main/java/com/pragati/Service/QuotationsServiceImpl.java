package com.pragati.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragati.Entity.Quotation;
import com.pragati.Repository.QuotationRepository;

import jakarta.persistence.EntityManager;

@Service
public class QuotationsServiceImpl implements QuotationsService {

	@Autowired
	private EntityManager entityManager;
	@Autowired
	private QuotationRepository quotationRepository;


	@Override
	public List<Object[]> saveforquotation() {

		String query = "select D.id, Q.date, P.productname, P.id, P.qty, P.mrp, P.gstpercentage, Q.sobtotal, Q.total from dealers as D, quotations as Q, products as P where D.id = Q.dealer_id";

		List<Object []> result = entityManager.createNativeQuery(query).getResultList();
		
		System.out.println("Result is :" +result.toString());
		
		
		return result;

	} 
		
	@Override
	public List<Quotation> FindAll() {
		
		return quotationRepository.findAll();
	}
}
