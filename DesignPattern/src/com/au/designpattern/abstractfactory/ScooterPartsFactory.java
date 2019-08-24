package com.au.designpattern.abstractfactory;

public class ScooterPartsFactory implements PartsFactory {

	@Override
	public Engine createEngine() {
		return new ScooterEngine();
	}

	

}
