package com.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.data.entity.DataServiceRequest;
import com.data.entity.DataServiceResponse;
import com.data.entity.Home;
import com.data.entity.PriceDetails;
import com.data.service.DataService;

@RestController
@RequestMapping("/data")
public class DataController {
	
	@Autowired
	private DataService dataService; 
	
	@RequestMapping(value = "/budgetHomeData",method = RequestMethod.POST)
	public DataServiceResponse getBudgetHomeData(@RequestBody DataServiceRequest request)
	{
		List<Home> homes =  dataService.getbudgetHomeData(request.getPriceDetails().getMaxprice(),request.getPriceDetails().getMinprice());
		DataServiceResponse response = new DataServiceResponse(homes);
		return response;
		
	}
	
	@RequestMapping(value = "/getHomeFromSqft",method = RequestMethod.POST)
	public DataServiceResponse getHomeBySqft(@RequestBody DataServiceRequest request)
	{
		List<Home> homes =  dataService.getHomeBysqft(request.getSqft());
		DataServiceResponse response = new DataServiceResponse(homes);
		return response;
		
	}
	
	@RequestMapping(value = "/getHomeFromYear",method = RequestMethod.POST)
	public DataServiceResponse getHomeByYear(@RequestBody DataServiceRequest request)
	{
		List<Home> homes =  dataService.getHomeByYear(request.getYear());
		System.out.println(homes.size());
		DataServiceResponse response = new DataServiceResponse(homes);
		return response;
		
	}
	


}
