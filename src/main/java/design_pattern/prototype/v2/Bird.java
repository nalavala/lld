package design_pattern.prototype.v2;

public class Bird implements Cloneable<Bird> {

    private String name;
    private String color;

    public Bird() {}

    // This is copy constructor which helps to copy old bird to new bird
    public Bird(Bird old) {
        this.name = old.name;
        this.color = old.color;
    }

    @Override
    public Bird clone() {
        return new Bird(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
