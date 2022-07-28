package com.udacity.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.udacity.microservices.entity.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {
	
//	@Query("select id, breed from Dog where id=:id")
//	String findBreedById(Long id);
//	
//	@Query("select breed from Dog")
//	List<String> findAllBreed();
//	
//	@Query("select name from Dog")
//	List<String> finAllName();

}
