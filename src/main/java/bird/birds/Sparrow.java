package bird.birds;

import bird.Flyable;
import bird.behaviour.FlyingBehaviour;

public class Sparrow extends Bird implements Flyable {

    private FlyingBehaviour flyingBehaviour;

    public Sparrow(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    void eat() {
        System.out.println("Sparrow eat");
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow make sound");
    }

    @Override
    public void fly() {
        flyingBehaviour.fly();
    }
}
