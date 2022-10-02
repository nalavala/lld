package design_snake_and_ladder.model;

import java.util.Random;

public class Dice {

    private int end;
    private int start;

    private Random random = new Random();

    Dice(int max) {
        this.end = max;
        this.start = 1;
    }

    public int roll() {
        return random.nextInt(end) + 1;
    }
}
