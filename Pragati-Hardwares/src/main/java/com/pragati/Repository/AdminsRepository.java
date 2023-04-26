package com.pragati.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragati.Entity.Admins;

@Repository
public interface AdminsRepository extends JpaRepository<Admins, Integer> {

}
