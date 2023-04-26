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

import com.pragati.Entity.Cities;
import com.pragati.Service.CitiesServiceImpl;

@RestController
@RequestMapping("/api")
public class CitiesController {

	@Autowired
	private CitiesServiceImpl citiesServiceImpl;

	@RequestMapping("/cities")
	public List<Cities> Allcity() {

		return citiesServiceImpl.FindAll();

	}

	@RequestMapping("/cities/{theId}")
	public Optional<Cities> FindcitybyId(@PathVariable int theId) {

		Optional<Cities> cities = citiesServiceImpl.FindbyId(theId);

		if (cities == null) {

			throw new RuntimeException("Couldn't find id :" + theId);
		}
		return cities;

	}

	@PostMapping("/cities")
	public Cities SaveCity(@RequestBody Cities cities) {
		
		cities.setId(0);
		
		citiesServiceImpl.save(cities);
		
		return cities;
	}
	
	@PutMapping("/cities")
	public Cities UpdateCity(@RequestBody Cities cities) {
		
		citiesServiceImpl.save(cities);
		
		return cities;
	}
	
	@DeleteMapping("/cities/{theId}")
	public String Deletecitybyid(@PathVariable int theId) {
		
		Optional<Cities> cities = citiesServiceImpl.FindbyId(theId);

		if (cities == null) {

			throw new RuntimeException("Couldn't find id :" + theId);
		}
		
		citiesServiceImpl.DeletebyId(theId);
		
		return "Deleted Id : "+theId;
		
	}
}
