package com.au.designpattern.abstractfactory;

public class Dealer {

	public static void main(String[] args) {

		Workshop superbikeWorkshop = new SuperbikeWorkshop();
		Bike superbike = superbikeWorkshop.assembleBike();

		Workshop scooterWorkshop = new ScooterWorkshop();
		Bike scooter = scooterWorkshop.assembleBike();

		System.out.println("superbike is = " + superbike);
		System.out.println("scooter is = " + scooter);

	}

}
