package com.pragati.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragati.Entity.Dealers;

@Repository
public interface DealersRepository extends JpaRepository<Dealers, Integer>{

}
