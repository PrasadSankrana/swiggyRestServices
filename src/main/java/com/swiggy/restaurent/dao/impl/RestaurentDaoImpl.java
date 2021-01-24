package com.swiggy.restaurent.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.swiggy.restaurent.dao.RestaurentDao;
import com.swiggy.restaurent.entity.RestaurentEntity;
import com.swiggy.restaurent.repository.RestaurentRepository;

@Component
public class RestaurentDaoImpl implements RestaurentDao {

	@Autowired
	private RestaurentRepository restaurentRepo;
	
	@Override
	public List<RestaurentEntity> getAllRestaurents() {
		return this.restaurentRepo.findAll();
	}

	@Override
	public List<RestaurentEntity> getOnlineRestaurents() {
		return this.restaurentRepo.getOnlineRestaurents();
	}

}
