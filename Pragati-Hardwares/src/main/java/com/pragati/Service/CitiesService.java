package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import com.pragati.Entity.Cities;


public interface CitiesService {

	public List<Cities>FindAll();
	
	public Optional<Cities>FindbyId(int theId);
	
	public void save(Cities cities);
	
	public String DeletebyId(int theId);
}
