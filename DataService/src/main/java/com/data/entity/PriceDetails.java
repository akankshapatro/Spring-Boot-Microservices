package com.data.entity;

public class PriceDetails {
	
	private Double maxprice;
	private Double minprice;
	public PriceDetails(Double maxprice, Double minprice) {
		super();
		this.maxprice = maxprice;
		this.minprice = minprice;
	}
	public Double getMaxprice() {
		return maxprice;
	}
	public void setMaxprice(Double maxprice) {
		this.maxprice = maxprice;
	}
	public Double getMinprice() {
		return minprice;
	}
	public void setMinprice(Double minprice) {
		this.minprice = minprice;
	}
	public PriceDetails() {
		super();
	}
	@Override
	public String toString() {
		return "PriceDetails [maxprice=" + maxprice + ", minprice=" + minprice + "]";
	}
	
	
	
	

}
