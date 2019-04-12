package com.xworkz.hotel.app;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	private List<String> itemList=new ArrayList<>();
	
	private int price=50;
	
	public Hotel() {
		System.out.println("created\t"+this.getClass().getSimpleName());
		
		itemList.add("dosa");
		itemList.add("pizza");
		itemList.add("burger");
		itemList.add("veg biriyani");
		itemList.add("buns");
	}
	public int orderItem(String item, int qty)
	{		
		if(itemList.contains(item))
		{
			System.out.println("Item is available u can take order");
			System.out.println("Customer ordered:\t"+item+"\t"+qty);

			int totalPrice=qty*price;
			return totalPrice;
		}
		else
		{
			System.out.println("Item is closed, try with other items");
			System.out.println();
		}
		return 0;
		
	}
}
