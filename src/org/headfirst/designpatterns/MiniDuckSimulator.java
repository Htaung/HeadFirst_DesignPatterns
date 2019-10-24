package org.headfirst.designpatterns;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered()); // To change a duck’s behavior at runtime, just call the duck’s 
													   // setter method for that behavior.
		model.performFly(); // You can't do this if the implementation live inside the Duck class
	}
}
