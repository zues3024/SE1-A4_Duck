package headfirst.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {

		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
		setSwimBehavior(new SwimWithFeet());

	}

	public void display() {
		System.out.println("\nI'm a Mallard duck.");
	}
}
