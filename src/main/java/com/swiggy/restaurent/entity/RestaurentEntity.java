package com.swiggy.restaurent.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Data
@Table(name="restaurant")
public class RestaurentEntity {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getRatings() {
		return ratings;
	}

	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="r_id")
	private Long id;
	
    @Column(name="r_name")
	private String name;
    
    @Column(name="r_street")
	private String street;
    
    @Column(name="r_town")
	private String town;

    @Column(name="r_pc")
	private String pincode;
    
    @Column(name="r_phone")
	private String phone;
    
    @Column(name="r_website")
	private String website;
    
    @Column(name="r_o_email")
	private String email;
    
    @Column(name="r_ratings")
	private Integer ratings;
    
    @Column(name="r_online")
	private boolean isOnline;

}


