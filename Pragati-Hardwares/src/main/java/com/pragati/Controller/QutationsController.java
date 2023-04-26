package com.pragati.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragati.Entity.Quotation;
import com.pragati.Service.QuotationsServiceImpl;

@RestController
@RequestMapping("/api")
public class QutationsController {

	@Autowired
	private QuotationsServiceImpl quotationsServiceImpl;

	@PostMapping("/getquotation")
	public List<Object[]> quotationsave(@RequestBody Quotation quotation) {

		List<Object[]> objects = quotationsServiceImpl.saveforquotation();
	
		return null;

	}
	


}
