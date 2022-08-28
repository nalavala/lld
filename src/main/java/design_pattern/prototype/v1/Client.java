package design_pattern.prototype.v1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();




        List<Bird> children = new ArrayList<>();

        for(Bird bird : birds) {
            children.add(bird.clone());
        }
    }
}
