package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragati.Entity.Dealers;
import com.pragati.Repository.DealersRepository;

@Service
public class DealersServiceImpl implements DealerService {

	@Autowired
	private DealersRepository dealersRepository;
	
	
	@Override
	public List<Dealers> FindAll() {
		
		return dealersRepository.findAll();
	}

	@Override
	public Optional<Dealers> FindbyId(int theId) {
		
		Optional<Dealers> thedealer = dealersRepository.findById(theId);
		
		if(thedealer == null) {
			
			throw new RuntimeException("Dealer not found for id :"+theId);
		}
		
		return thedealer;
	}

	@Override
	public void save(Dealers dealers) {
		
		dealers.setId(0);
		
		dealersRepository.save(dealers);

	}

	@Override
	public String DeletebyId(int theId) {
		
		dealersRepository.deleteById(theId);
		
		return "Deleted Id : "+theId;
	}

}
