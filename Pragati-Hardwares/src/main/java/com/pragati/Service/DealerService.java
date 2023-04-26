package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import com.pragati.Entity.Dealers;

public interface DealerService {

	public List<Dealers> FindAll();
	
	public Optional<Dealers>FindbyId(int theId);
	
	public void save(Dealers dealers);
	
	public String DeletebyId(int theId);
	
}
