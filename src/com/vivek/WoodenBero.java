package com.vivek;

public class WoodenBero extends Bero{
	private String woodType;

	public WoodenBero(String beroType, String beroColour, double price, String woodType) {
		super(beroType, beroColour, price);
		this.woodType = woodType;
	}

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	@Override
	public void calculatePrice() {
		if(woodType.equals("Ply Wood")) {
			setPrice(15000);
		}
		else if(woodType.equals("Teak Wood")) {
			setPrice(12000);
		}
		else if(woodType.equals("Engineered Wood")) {
			setPrice(10000);
		}
		else {
			setPrice(0);
		}
	}
	
}
