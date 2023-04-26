package com.pragati.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pragati.Entity.APIResponse;
import com.pragati.Entity.Autherization;
import com.pragati.Service.AutherizationServiceImpl;

@RestController
public class AutherizationController {

	@Autowired
	private AutherizationServiceImpl autherizationServiceImpl;
	
	
	@PostMapping("/login")
	public ResponseEntity<APIResponse> Validations(@RequestBody Autherization autherization) {
		
		APIResponse apiresponse = autherizationServiceImpl.Login(autherization);
		return ResponseEntity
				.status(apiresponse.getStatus())
				.body(apiresponse);
		        
		
		
	}
}
