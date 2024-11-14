package headfirst.designpatterns.strategy;

public class MiniDuckSimulator2 {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.performSwim();

        Duck saDuck = new SanAntonioDuck();
        saDuck.display();
        saDuck.performSwim();
        saDuck.performFly();
        saDuck.performWalk();
        saDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
        rubberDuck.performFly();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performSwim();
        decoyDuck.performQuack();
    }
}
