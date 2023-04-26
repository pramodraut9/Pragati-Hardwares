package com.pragati.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pragati.Entity.Cities;

public interface CitiesRepository extends JpaRepository<Cities, Integer> {

}
