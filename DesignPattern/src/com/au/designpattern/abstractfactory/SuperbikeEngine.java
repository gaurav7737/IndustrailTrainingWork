package com.au.designpattern.abstractfactory;

public class SuperbikeEngine implements Engine {

	public SuperbikeEngine() {
		System.out.println("Creating superbike engine");
	}

	public String toString() {
		return "SuperbikeEngine";
	}

}
