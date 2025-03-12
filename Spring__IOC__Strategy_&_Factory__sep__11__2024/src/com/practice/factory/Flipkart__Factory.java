package com.practice.factory;

import com.practice.components.Blurdot__Courier__Impl;
import com.practice.components.DTDC__Courier__Impl;
import com.practice.components.FirstFlight__Courier__Impl;
import com.practice.components.Flipkart;

public class Flipkart__Factory
{
public static Flipkart get_Flipkart(String courier_Service)
{
	Flipkart fkart = new Flipkart();
	
	if(courier_Service.equalsIgnoreCase("dtdc"))
		fkart.setCourier(new DTDC__Courier__Impl());
	
	else if(courier_Service.equalsIgnoreCase("bluedot"))
	fkart.setCourier(new Blurdot__Courier__Impl());
	
	else if(courier_Service.equalsIgnoreCase("firstflight"))
		fkart.setCourier(new FirstFlight__Courier__Impl());
	
	else
		throw new IllegalArgumentException();
		
	return fkart;
	
	
	
}
}
