package bird.birds;

import bird.Flyable;

public class Pigeon extends Bird implements Flyable {

    @Override
    void eat() {
        System.out.println("Pigeon eating");
    }

    @Override
    void makeSound() {
        System.out.println("Pigeon sound");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon flying");
    }
}
