package headfirst.designpatterns.strategy;

public class SanAntonioDuck extends Duck {

	public SanAntonioDuck() {

		setQuackBehavior(new QuackAtBoats());
		setFlyBehavior(new FlyWithWings());
		setSwimBehavior(new SwimWithFeet());
		setWalkBehavior(new WalkWithFeet());

	}

	public void display() {
		System.out.println("\nI'm a Riverwalk duck.");
	}
}
