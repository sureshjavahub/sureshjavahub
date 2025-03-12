package com.practice.main;

import com.practice.components.Flipkart;
import com.practice.factory.Flipkart__Factory;

public class Main {

	public static void main(String[] args) {
		Flipkart fkart = Flipkart__Factory.get_Flipkart("dtdc");
		String result = fkart.shopping(new String[]{"jjfh","fjhhr"}, new Double[] {3566d,55566d});
		System.out.println(result);
		
		
		

	} 

}
