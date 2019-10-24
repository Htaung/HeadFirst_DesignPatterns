package org.headfirst.designpatterns;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		super();
		this.flyBehaviour = new FlyNoWay();
		this.quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
	

}
