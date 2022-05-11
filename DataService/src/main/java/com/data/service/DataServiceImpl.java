package com.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.dao.DataServiceRepository;
import com.data.entity.Home;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private DataServiceRepository dataServiceRepository;
	
	public List<Home> getbudgetHomeData(Double maxprice, Double minprice) {
		List<Home> homes = dataServiceRepository.getHomeByPrice(maxprice, minprice);
		//st<Home> homes = List.of(dataServiceRepository.gethome(maxprice));
		return homes;
	}

	
	public List<Home> getHomeBysqft(int sqft) {
		List<Home> homes = dataServiceRepository.getHomeBySqft(sqft);
		return homes;
	}


	public List<Home> getHomeByYear(int year) {
		List<Home> homes = dataServiceRepository.getHomeByYear(year);
		return homes;
	}
}
