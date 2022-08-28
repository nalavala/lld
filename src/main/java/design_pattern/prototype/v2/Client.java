package design_pattern.prototype.v2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Bird genericbird = new Bird();
        genericbird.setName("bird");
        genericbird.setColor("red");


        Crow crow = new Crow();
        crow.setColor("black");
        crow.setName("crow");
        crow.setSound("bla bla");

        Pegiun pegiun = new Pegiun();
        pegiun.setHeight("23feet");
        pegiun.setColor("red");
        pegiun.setName("pegiun");


        List<Bird> birds = new ArrayList<>();
        birds.add(genericbird);
        birds.add(crow);
        birds.add(pegiun);
        List<Bird> children = new ArrayList<>();

        for(Bird bird : birds) {
            children.add(bird.clone());
        }

        // After cloning we can have modify attributes
        for(Bird bird : children) {
            bird.setName("Its a clone");
        }

        System.out.println(children);
    }
}
