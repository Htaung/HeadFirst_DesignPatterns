package org.headfirst.designpatterns;

public class MallardDuck extends Duck{

	public MallardDuck() {
		super();
		this.quackBehaviour = new Quack();
		this.flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm real Mallard Duck");
	}

}
