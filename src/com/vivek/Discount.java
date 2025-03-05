package com.vivek;

public class Discount {
	public double calculateDiscount(Bero obj) {
		if(obj.beroType.equals("Steel Bero")) {
			double price=obj.getPrice();
			double discount=(price*10)/100;
			obj.setPrice(price-discount);
			return discount;
		}
		else if(obj.beroType.equals("Wooden Bero")) {
			double price=obj.getPrice();
			double discount=(price*15)/100;
			obj.setPrice(price-discount);
			return discount;
		}
		else {
			return 0;
		}
	}
}
