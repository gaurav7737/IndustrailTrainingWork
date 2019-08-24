package com.au.designpattern.abstractfactory;

public abstract class Workshop {

	protected abstract Bike createBike();

	public Bike assembleBike() {
		System.out.println("Beginning to assemble bike");
		Bike bike = createBike();
		bike.prepare();
		bike.paint();

		return bike;
	}
}
