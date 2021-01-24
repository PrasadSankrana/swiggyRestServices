package com.swiggy.restaurent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.restaurent.entity.RestaurentEntity;
import com.swiggy.restaurent.service.RestaurentService;


@RestController
public class RestaurentController {

	@Autowired
	RestaurentService service;
	
	@GetMapping(value="/restaurents",produces= {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<RestaurentEntity>> getRestaurents() {
        List<RestaurentEntity> list = service.getRestaurents();
        
         return new ResponseEntity<List<RestaurentEntity>>(list, HttpStatus.OK);
    }
	
	@GetMapping(value="/restaurents/online", produces= {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<RestaurentEntity>> getAvailableRestaurents() {
        List<RestaurentEntity> list = service.getOnlineRestaurents();
 
        return new ResponseEntity<List<RestaurentEntity>>(list, HttpStatus.OK);
    }
	
	
	
	

}
