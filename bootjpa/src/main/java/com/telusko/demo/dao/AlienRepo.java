package com.telusko.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.telusko.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>
{
	/*
	// This method can be created , obtained by using some predefined rules
	List<Alien> findByTech(String tech);

	List<Alien> findByAidGreaterThan(int aid);

	// This is used to write custom queries and create a method to it
	@Query("from Alien where tech=?1 order by aname")
	List<Alien>findByTechSorted(String tech);
	
	*/
}