package com.au.designpattern.abstractfactory;

public class SuperbikeWorkshop extends Workshop {

	@Override
	protected Bike createBike() {

		PartsFactory superbikePartsFactory = new SuperbikePartsFactory();
		Bike superbike = new Superbike(superbikePartsFactory);
		return superbike;
	}

}
