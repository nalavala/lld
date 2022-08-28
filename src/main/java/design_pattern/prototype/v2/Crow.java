package design_pattern.prototype.v2;

public class Crow extends Bird {
    private String sound;

    public Crow() {

    }
    // Prototype chain
    public Crow(Crow old) {
        super(old);
        this.sound = old.sound;
    }
    @Override
    public Bird clone() {
        return new Crow(this);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
