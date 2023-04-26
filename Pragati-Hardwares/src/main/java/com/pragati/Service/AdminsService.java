package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import com.pragati.Entity.Admins;

public interface AdminsService {
	
	public List<Admins>FindAll();
	
	public Optional<Admins>FindbyId(int theId);
	
	public void save(Admins admins);
	
	public String DeletebyId(int theId);
	

}
