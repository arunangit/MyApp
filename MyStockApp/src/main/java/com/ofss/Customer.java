package com.ofss;

import java.util.Arrays;

public class Customer {
	String customerName;
	Stock custStocks[];
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, Stock[] custStocks) {
		super();
		this.customerName = customerName;
		this.custStocks = custStocks;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", custStocks=" + Arrays.toString(custStocks) + "]";
	}
	
}
