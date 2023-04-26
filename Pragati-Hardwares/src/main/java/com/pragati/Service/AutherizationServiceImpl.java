package com.pragati.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragati.Entity.APIResponse;
import com.pragati.Entity.Autherization;
import com.pragati.Repository.AutherizationRepository;

@Service
public class AutherizationServiceImpl implements AutherizationService {

	@Autowired
	private AutherizationRepository autherizationRepository;

	@Override
	public APIResponse Login(Autherization autherization) {
		
		APIResponse apiResponse =new APIResponse();
		
		//validation
		
		//verify user exist with given details 
		 Autherization auth = autherizationRepository.findOneByusernameAndIgnoreCasepassword(autherization.getUsername(),autherization.getPassword());
		
		 //response
		if(auth == null) {
	        apiResponse.setData("User login failed");
		}else {
			apiResponse.setData("User Logged in");
			//System.out.println(auth.getUsername());
		}
		return apiResponse;
		}

	}



