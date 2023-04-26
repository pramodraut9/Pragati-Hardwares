package com.pragati.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragati.Entity.Dealers;
import com.pragati.Service.DealersServiceImpl;

@RestController
@RequestMapping("/api")
public class DealersController {

	@Autowired
	private DealersServiceImpl dealersServiceImpl;

	@RequestMapping("/dealers")
	public List<Dealers> Alldealers() {

		return dealersServiceImpl.FindAll();
	}

	@RequestMapping("/dealers/{theId}")
	public Optional<Dealers> getdealerbyid(@PathVariable int theId) {

		Optional<Dealers> dealers = dealersServiceImpl.FindbyId(theId);

		if (dealers == null) {

			throw new RuntimeException("Dealer not found for id :" + theId);
		}

		return dealers;
	}

	@PostMapping("/dealers")
	public  Dealers SaveDealer(@RequestBody Dealers dealers) {

		dealers.setId(0);

		dealersServiceImpl.save(dealers);
		
		return dealers;
	}

	@PutMapping("/dealers")
	public Dealers UpdateDealer(@RequestBody Dealers dealers) {

     dealersServiceImpl.save(dealers);
    
     return dealers;
	}
	

	@DeleteMapping("/dealers/{theId}")
	public String Deletedealer(@PathVariable int theId) {

		Optional<Dealers> dealers = dealersServiceImpl.FindbyId(theId);

		if (dealers == null) {

			throw new RuntimeException("Dealer not found for id :" + theId);
		}
		dealersServiceImpl.DeletebyId(theId);
		
		return " Deleted Id :" + theId;
	}

}
