package com.swiggy.restaurent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.restaurent.dao.RestaurentDao;

import com.swiggy.restaurent.entity.RestaurentEntity;


@Service
public class RestaurentService {

	@Autowired
	private RestaurentDao r_dao;
	
	
	public List<RestaurentEntity> getRestaurents() {
		List<RestaurentEntity> restuarents = this.r_dao.getAllRestaurents();
		
		return restuarents;
	}
	
	public List<RestaurentEntity> getOnlineRestaurents() {
		List<RestaurentEntity> restuarents = this.r_dao.getOnlineRestaurents();
		
		return restuarents;
	}

}
