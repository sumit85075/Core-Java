package com.vivek;

public abstract class Bero {
	protected String beroType;
	private String beroColour;
	private double price;
	
	public Bero(String beroType, String beroColour, double price) {
		super();
		this.beroType = beroType;
		this.beroColour = beroColour;
		this.price = price;
	}
	

	public String getBeroType() {
		return beroType;
	}


	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}


	public String getBeroColour() {
		return beroColour;
	}


	public void setBeroColour(String beroColour) {
		this.beroColour = beroColour;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public abstract void calculatePrice();


}
