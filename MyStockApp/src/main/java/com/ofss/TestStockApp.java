package com.ofss;

public class TestStockApp {

	public static void main(String[] args) {
		System.out.println("***********************************************");
		Stock st1 = new Stock(1000, "BLUE BIRD", 1030.00);
		Stock st2 = new Stock(2000, "MARK 1", 13301.01);
		Stock st3 = new Stock(3000, "MARK 2", 3401.30);
		Stock st4 = new Stock(4000, "IRON BIRD", 9301.80);
		Stock stocks1[] = {st1,st2,st3,st4};
		Stock stocks2[] = {st2,st3,st4};
		
		Customer c1 = new Customer("Captain America", stocks1);
		Customer c2 = new Customer("Iron Man", stocks2);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println("***********************************************");
	}

}
