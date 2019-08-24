package com.au.designpattern.abstractfactory;

public abstract class Bike {

	private Engine engine;
	

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	

	protected abstract void prepare();

	public void paint() {
		System.out.println("Painting bike now");
	}

	@Override
	public String toString() {
		return "Bike [engine=" + engine + "]";
	}

}
