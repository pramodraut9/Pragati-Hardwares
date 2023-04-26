package com.pragati.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.pragati.Entity.Admins;
import com.pragati.Repository.AdminsRepository;



@Service
public class AdminsServiceImpl implements AdminsService {

	@Autowired
	private AdminsRepository adminsRepository;
	

	@Override
	public List<Admins> FindAll() {

		return adminsRepository.findAll();
	}

	@Override
	public Optional<Admins> FindbyId(@PathVariable int theId) {

		Optional<Admins> admins = adminsRepository.findById(theId);

		if (admins == null) {

			throw new RuntimeException("The Admin id not found " + theId);
		}

		return admins;
	}

	@Override
	public void save(Admins admins) {

		adminsRepository.save(admins);
	}

	@Override
	public String DeletebyId(@PathVariable int theId) {

		adminsRepository.deleteById(theId);

		return "Deleted id :" + theId;
	}

}
