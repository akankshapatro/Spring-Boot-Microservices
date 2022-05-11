package com.query.enitiy;

import java.util.List;

public class DataServiceResponse {
	
	List<Home> homes;

	public List<Home> getHomes() {
		return homes;
	}

	public void setHomes(List<Home> homes) {
		this.homes = homes;
	}

	public DataServiceResponse(List<Home> homes) {
		super();
		this.homes = homes;
	}

	public DataServiceResponse() {
		super();
	}

	
}
