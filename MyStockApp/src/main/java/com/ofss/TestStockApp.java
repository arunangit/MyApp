package com.ofss;

public class TestStockApp {

	public static void main(String[] args) {
		System.out.println("***********************************************");
		Stock st1 = new Stock(1000, "BLUE BIRD", 1030.00);
		Stock st2 = new Stock(2000, "MARK 1", 13301.00);
		
		Customer c1 = new Customer("Captain America", st1);
		Customer c2 = new Customer("Iron Man", st2);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println("***********************************************");
	}

}
