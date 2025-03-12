package com.practice.components;

public class DTDC__Courier__Impl implements ICourier {

	@Override
	public String deliver(Integer p_Id) {
	System.out.println(p_Id);
		
		return "product of id "+p_Id+" is handovered to DTDC for delivery";
	}

}
