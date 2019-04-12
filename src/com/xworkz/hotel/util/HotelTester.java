package com.xworkz.hotel.util;

import com.xworkz.hotel.app.Hotel;

public class HotelTester {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Hotel hotel=new Hotel();
		int tootalPrice=hotel.orderItem("dosa", 3);
		
		System.out.println("tootalPrice:\t"+tootalPrice);
	}
}
