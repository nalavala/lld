package design_pattern.prototype.v2;

import java.util.Map;

public class BirdRegistry {

    private Map<String, Bird> birds;

    public void addBird(String name, Bird bird) {
        birds.put(name, bird);
    }

    public Bird getBird(String name) {
        return birds.get(name).clone();
    }
}
