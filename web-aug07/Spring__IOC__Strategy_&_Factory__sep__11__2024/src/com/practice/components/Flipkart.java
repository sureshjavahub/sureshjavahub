package com.practice.components;

import java.util.Arrays;

public class Flipkart 
{
private ICourier courier;
 
 
public String shopping(String product[],Double  price[])
{
	Double amt=0d;
	for(Double p:price)
		amt+=p;
	
	return "your items "+Arrays.toString(product)+"of price "+amt+" and "+courier.deliver(Integer.valueOf((int)(Math.random()*1000000)));
}


public void setCourier(ICourier courier) {
	this.courier = courier;
}

}
