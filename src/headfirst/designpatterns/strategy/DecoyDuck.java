package headfirst.designpatterns.strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
		setSwimBehavior(new SwimNoWay());
	}
	public void display() {
		System.out.println("\nI'm a duck Decoy");
	}
}
