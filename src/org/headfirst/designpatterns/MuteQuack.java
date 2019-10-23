package org.headfirst.designpatterns;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
