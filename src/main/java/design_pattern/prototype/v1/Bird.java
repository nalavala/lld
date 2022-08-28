package design_pattern.prototype.v1;

public class Bird implements Cloneable<Bird> {

    private String name;
    private String color;

    public Bird() {}

    @Override
    public Bird clone() {
        Bird newBird = new Bird();
        newBird.color = this.color;
        newBird.name = this.name;
        return newBird;

    }
}
