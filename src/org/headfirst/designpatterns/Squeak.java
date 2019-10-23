package org.headfirst.designpatterns;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println(" << Silence >> ");
	}

}
