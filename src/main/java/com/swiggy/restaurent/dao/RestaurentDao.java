package com.swiggy.restaurent.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.swiggy.restaurent.entity.RestaurentEntity;

@Repository
public interface RestaurentDao {

	List<RestaurentEntity> getAllRestaurents();
	List<RestaurentEntity> getOnlineRestaurents();
	

}
