package org.headfirst.designpatterns;

public class FlyNoWay implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I'm not flying");
	}
	
}
