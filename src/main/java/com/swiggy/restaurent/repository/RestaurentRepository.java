package com.swiggy.restaurent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.swiggy.restaurent.entity.RestaurentEntity;

public interface RestaurentRepository extends JpaRepository<RestaurentEntity, Long> {

	
	@Query("SELECT r FROM RestaurentEntity r where r.isOnline=TRUE")
	List<RestaurentEntity> getOnlineRestaurents();

}
