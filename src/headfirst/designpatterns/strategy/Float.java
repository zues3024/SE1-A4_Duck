package headfirst.designpatterns.strategy;

public class Float implements SwimBehavior {
	public void swim() {
		System.out.println("I can float.");
	}
}
