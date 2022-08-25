package bird.birds;

import bird.Flyable;
import bird.behaviour.FlyingBehaviour;

public class Crow extends Bird implements Flyable {

    private FlyingBehaviour flyingBehaviour;

    public Crow(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    void eat() {
        System.out.println("Crow eating");
    }

    @Override
    void makeSound() {
        System.out.println("Crow making sound");
    }

    @Override
    public void fly() {
        flyingBehaviour.fly();
    }
}
