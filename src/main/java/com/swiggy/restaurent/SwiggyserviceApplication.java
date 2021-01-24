package com.swiggy.restaurent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.swiggy.restaurent.controller.RestaurentController;

@SpringBootApplication
public class SwiggyserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiggyserviceApplication.class, args);
	}

}
