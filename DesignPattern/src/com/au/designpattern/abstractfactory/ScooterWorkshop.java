package com.au.designpattern.abstractfactory;

public class ScooterWorkshop extends Workshop{

	@Override
	protected Bike createBike() {
		PartsFactory scooterPartsFactory = new ScooterPartsFactory();
		Bike scooter = new Scooter(scooterPartsFactory);
		return scooter;
	}

}
