package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.pragati.Entity.Cities;
import com.pragati.Repository.CitiesRepository;

@Service
public class CitiesServiceImpl implements CitiesService {

	@Autowired
	private CitiesRepository citiesRepository;

	@Override
	public List<Cities> FindAll() {

		return citiesRepository.findAll();
	}

	@Override
	public Optional<Cities> FindbyId(@PathVariable int theId) {

		Optional<Cities> cities = citiesRepository.findById(theId);

		if (cities == null) {

			throw new RuntimeException("city id cannot be found");
		}
		return cities;
	}

	@Override
	public void save(Cities cities) {

		citiesRepository.save(cities);

	}

	@Override
	public String DeletebyId(int theId) {

		citiesRepository.deleteById(theId);

		return "Deleted id :" + theId;
	}

}
