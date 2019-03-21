package com.rental.car;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarApplication {
  private final String FILENAME = "rental.json";
  private List<Car> carLists;

  public void getRentalJson() {
    ObjectMapper mapper = new ObjectMapper();
	ClassLoader classLoader = getClass().getClassLoader();
	mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

	try {
	  File file = new File(classLoader.getResource(FILENAME).getFile());
	  carLists = Arrays.asList(mapper.readValue(new FileInputStream(file), Car[].class));

	  //Collections.sort(carLists);

	  int dummy = 0;
	}
	catch (IOException io)	 {
	  io.printStackTrace();
	}
  }

  /**
   * Question 2: Return all cars which have the lowest per day rental cost for both cases:
   *       a. Price only
   *       b. Price after discounts
   *
   * @return
  */
  public List<Car>  getLowestRental() {
    int minPrice = 0;
	int minPriceAfterDiscount = 0;
    carLists.forEach(car->{
      int priceAfterDiscount =  car.getPerdayrent().getPrice() * (1 - (car.getPerdayrent().getDiscount() / 100));
      if ( (car.getPerdayrent().getPrice() < minPrice) &&
           (minPriceAfterDiscount < minPriceAfterDiscount) ) {

      }

    });



  	return null;

  }

  /**
   * Question 3: Find the highest revenue generating car. year over year maintenance
   * cost + depreciation is the total expense per car for the full year for the rental car company.
   * The objective is to find those cars that produced the highest profit in the last year
  */
  public List<Car>  getHighestRevenue() {
  	return null;

  }

  
  
  
  
	public static void main(String[] args ) {
	  CarApplication carApp = new CarApplication();
      carApp.getRentalJson();
	}
}
