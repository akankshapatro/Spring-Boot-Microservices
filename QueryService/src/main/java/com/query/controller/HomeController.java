package com.query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.query.enitiy.DataServiceRequest;
import com.query.enitiy.DataServiceResponse;
import com.query.enitiy.PriceDetails;

@RestController
@RequestMapping("/query")
public class HomeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/budgetHome",method = RequestMethod.POST)
	@HystrixCommand(fallbackMethod = "handleDownTimeForPrice")
	public DataServiceResponse getBudgetHomes(@ModelAttribute("maxprice") Double maxprice,@ModelAttribute("minprice") Double minprice) {
		String url = "http://DATA-SERVICE/data/budgetHomeData";
		DataServiceRequest request = new DataServiceRequest();
		request.setPriceDetails(new PriceDetails(maxprice,minprice));
		DataServiceResponse result = restTemplate.postForObject(url, request, DataServiceResponse.class);
		return result;
	}
	
	@RequestMapping(value="/getHomeFromSqft",method = RequestMethod.POST)
	@HystrixCommand(fallbackMethod = "handleDownTimeForSqft")
	public DataServiceResponse getHomeFromSqft(@ModelAttribute("sqft") int sqft ) {
		String url = "http://DATA-SERVICE/data/getHomeFromSqft";
		DataServiceRequest request = new DataServiceRequest();
		request.setSqft(sqft);
		DataServiceResponse result = restTemplate.postForObject(url, request, DataServiceResponse.class);
		return result;
	}
	
	@RequestMapping(value="/getHomeFromYear",method = RequestMethod.POST)
	@HystrixCommand(fallbackMethod = "handleDownTimeForYear")
	public DataServiceResponse getHomeFromYear(@ModelAttribute("year") int year ) {
		String url = "http://DATA-SERVICE/data/getHomeFromYear";
		DataServiceRequest request = new DataServiceRequest();
		request.setYear(year);
		DataServiceResponse result = restTemplate.postForObject(url, request, DataServiceResponse.class);
		return result;
	}
	
	public DataServiceResponse handleDownTimeForPrice(@ModelAttribute("maxprice") Double maxprice,@ModelAttribute("minprice") Double minprice) {
		return new DataServiceResponse();
	}
	public DataServiceResponse handleDownTimeForSqft(@ModelAttribute("sqft") int sqft ) {
		return new DataServiceResponse();
	}
	
	public DataServiceResponse handleDownTimeForYear(@ModelAttribute("year") int year ) {
		return new DataServiceResponse();
	}
	

}
