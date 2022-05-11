package com.data.entity;

public class DataServiceRequest {
	
	private PriceDetails priceDetails;
	private int sqft;
	private int year;
	public DataServiceRequest(PriceDetails priceDetails, int sqft, int year) {
		super();
		this.priceDetails = priceDetails;
		this.sqft = sqft;
		this.year = year;
	}
	public DataServiceRequest() {
		super();
	}
	public PriceDetails getPriceDetails() {
		return priceDetails;
	}
	public void setPriceDetails(PriceDetails priceDetails) {
		this.priceDetails = priceDetails;
	}
	public int getSqft() {
		return sqft;
	}
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "DataServiceRequest [priceDetails=" + priceDetails + ", sqft=" + sqft + ", year=" + year + "]";
	}
	
	

}
