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

import com.pragati.Entity.Admins;
import com.pragati.Service.AdminsServiceImpl;

@RestController
@RequestMapping("/api")
public class AdminsController {

	// Aggregation and autowiring all serviceimplmethods
	@Autowired
	private AdminsServiceImpl adminsServiceImpl;

	// handler for all admins
	@RequestMapping("/admins")
	public List<Admins> Alladmins() {

		return adminsServiceImpl.FindAll();
	}

	// handler for getting single admin
	@RequestMapping("/admins/{theId}")
	public Optional<Admins> getAdminById(@PathVariable int theId) {

		Optional<Admins> theadmin = adminsServiceImpl.FindbyId(theId);

		if (theadmin == null) {

			throw new RuntimeException("Admin Id not found :--" + theId);
		}
		return theadmin;

	}

	// Handler for saving new admin
	@PostMapping("/admins")
	public Admins Saveadmin(@RequestBody Admins admins) {

		admins.setId(0);
		adminsServiceImpl.save(admins);

		return admins;
	}

	// handler for update admin
	@PutMapping("/admins")
	public Admins UpdateAdmins(@RequestBody Admins admins) {

		adminsServiceImpl.save(admins);
		return admins;
	}

	// Handler foe delete admin
	@DeleteMapping("/admins/{theId}")
	public String Deleteadmins(@PathVariable int theId) {

		Optional<Admins> admins = adminsServiceImpl.FindbyId(theId);

		if (admins == null) {

			throw new RuntimeException("Cannot find admin for " + theId);

		}

		adminsServiceImpl.DeletebyId(theId);

		return "Deleated admin for id:" + theId;
	}

}
