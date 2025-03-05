package com.store;

public class CustomerDetails implements BonusPoints,DoorDelivery{
	private String customerName;
	private String phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;
	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	@Override
	public double deliveryCharge() {
		if(this.distance>=25) {
			return this.distance*8;
		}
		else if(this.distance>=15 && this.distance<25) {
			return this.distance*5;
		}
		else if(this.distance<15) {
			return this.distance*2;
		}
		return 0;
	}
	
	@Override
	public double calculateBonusPoints() {
		if(this.billAmount>250) {
			return this.billAmount/10;
		}
		else {
			return 0;
		}

	}
	
}
