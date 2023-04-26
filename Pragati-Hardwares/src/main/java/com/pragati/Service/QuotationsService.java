package com.pragati.Service;

import java.util.List;

import com.pragati.Entity.Quotation;

public interface QuotationsService {

	public List<Quotation> FindAll();
	public List<Object[]> saveforquotation();

}
