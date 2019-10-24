package org.headfirst.designpatterns;

public class FlyRocketPowered implements FlyBehaviour {

	public FlyRocketPowered() {
		super();
	}

	@Override
	public void fly() {
		System.out.println("I'm flying with rocket!");

	}

}
