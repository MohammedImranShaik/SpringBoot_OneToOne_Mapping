package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Passport;
@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {
	
	

}
