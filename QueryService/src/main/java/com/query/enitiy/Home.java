package com.query.enitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Home {
	
	private int id;
	private int bathrooms;
	private int bedrooms;
	private String city;
	private int condition;
	private String country;
	private String date;
	private Double floors;
	private Double price;
	private int sqftAbove;
	private int sqftbasement;
	private int sqftLiving;
	private int sqftLot;
	private String stateZip;
	private String street;
	private int view;
	private int waterfront;
	private int yrBuilt;
	private int yrRenovated;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCondition() {
		return condition;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getFloors() {
		return floors;
	}
	public void setFloors(Double floors) {
		this.floors = floors;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getSqftAbove() {
		return sqftAbove;
	}
	public void setSqftAbove(int sqftAbove) {
		this.sqftAbove = sqftAbove;
	}
	public int getSqftbasement() {
		return sqftbasement;
	}
	public void setSqftbasement(int sqftbasement) {
		this.sqftbasement = sqftbasement;
	}
	public int getSqftLiving() {
		return sqftLiving;
	}
	public void setSqftLiving(int sqftLiving) {
		this.sqftLiving = sqftLiving;
	}
	public int getSqftLot() {
		return sqftLot;
	}
	public void setSqftLot(int sqftLot) {
		this.sqftLot = sqftLot;
	}
	public String getStateZip() {
		return stateZip;
	}
	public void setStateZip(String stateZip) {
		this.stateZip = stateZip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getWaterfront() {
		return waterfront;
	}
	public void setWaterfront(int waterfront) {
		this.waterfront = waterfront;
	}
	public int getYrBuilt() {
		return yrBuilt;
	}
	public void setYrBuilt(int yrBuilt) {
		this.yrBuilt = yrBuilt;
	}
	public int getYrRenovated() {
		return yrRenovated;
	}
	public void setYrRenovated(int yrRenovated) {
		this.yrRenovated = yrRenovated;
	}
	public Home() {
		super();
	}
	public Home(int id, int bathrooms, int bedrooms, String city, int condition, String country, String date,
			Double floors, Double price, int sqftAbove, int sqftbasement, int sqftLiving, int sqftLot, String stateZip,
			String street, int view, int waterfront, int yrBuilt, int yrRenovated) {
		super();
		this.id = id;
		this.bathrooms = bathrooms;
		this.bedrooms = bedrooms;
		this.city = city;
		this.condition = condition;
		this.country = country;
		this.date = date;
		this.floors = floors;
		this.price = price;
		this.sqftAbove = sqftAbove;
		this.sqftbasement = sqftbasement;
		this.sqftLiving = sqftLiving;
		this.sqftLot = sqftLot;
		this.stateZip = stateZip;
		this.street = street;
		this.view = view;
		this.waterfront = waterfront;
		this.yrBuilt = yrBuilt;
		this.yrRenovated = yrRenovated;
	}
	@Override
	public String toString() {
		return "Home [id=" + id + ", bathrooms=" + bathrooms + ", bedrooms=" + bedrooms + ", city=" + city
				+ ", condition=" + condition + ", country=" + country + ", date=" + date + ", floors=" + floors
				+ ", price=" + price + ", sqftAbove=" + sqftAbove + ", sqftbasement=" + sqftbasement + ", sqftLiving="
				+ sqftLiving + ", sqftLot=" + sqftLot + ", stateZip=" + stateZip + ", street=" + street + ", view="
				+ view + ", waterfront=" + waterfront + ", yrBuilt=" + yrBuilt + ", yrRenovated=" + yrRenovated + "]";
	}
	
	
	
	
	

}
