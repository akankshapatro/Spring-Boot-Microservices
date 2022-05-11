package com.data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.data.entity.Home;

@Repository
public interface DataServiceRepository extends JpaRepository<Home, Integer> {

	@Query("select h from Home h where h.price <=:maxprice and h.price >=:minprice")
	public List<Home> getHomeByPrice(@Param("maxprice") Double maxprice,@Param("minprice") Double  minprice);

	@Query("select h from Home h where h.sqftLiving >=:sqft")
	public List<Home> getHomeBySqft(@Param("sqft") int sqft);

	@Query("select h from Home h where h.yrBuilt>:year or h.yrRenovated>:year")
	public List<Home> getHomeByYear(@Param("year") int year);
	
}
