package com.data.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.data.entity.Home;


public interface DataService {
	
	List<Home> getbudgetHomeData(Double maxprice, Double minprice);
	
	List<Home> getHomeBysqft(int sqft);
	
	List<Home> getHomeByYear(int year);

}
