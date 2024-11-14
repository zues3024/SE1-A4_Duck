package headfirst.designpatterns.strategy;

public class WalkWithFeet implements WalkBehavior {
	public void walk() {
		System.out.println("I can also walk with my feet");
	}
}
