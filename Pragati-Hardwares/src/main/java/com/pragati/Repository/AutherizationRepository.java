package com.pragati.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.pragati.Entity.Autherization;

@Repository
public interface AutherizationRepository extends JpaRepository<Autherization, Integer> {
    
	//method for login validation
	public Autherization findOneByusernameAndIgnoreCasepassword(String username, String password);

}
