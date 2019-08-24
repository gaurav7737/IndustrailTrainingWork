package com.au.designpattern.abstractfactory;

public class SuperbikePartsFactory implements PartsFactory {

	@Override
	public Engine createEngine() {
		return new SuperbikeEngine();
	}

	

}
