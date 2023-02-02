package com.ty.dto6;

public class FoodOrder {

	private int id;
	private String name;
	private long totalcost;
	private String hotel;
	
	private Customer customer;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getTotalcost() {
		return totalcost;
	}

	public String getHotel() {
		return hotel;
	}

	public Customer getCustomer() {
		return customer;
	}

	public FoodOrder(int id, String name, long totalcost, String hotel, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.totalcost = totalcost;
		this.hotel = hotel;
		this.customer = customer;
	}
	
	
}
