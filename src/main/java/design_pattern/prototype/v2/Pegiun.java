package design_pattern.prototype.v2;

public class Pegiun extends Bird {

    private String height;

    public Pegiun() {

    }
    public Pegiun(Pegiun old) {
        super(old);
        this.height = old.height;
    }
    @Override
    public Bird clone() {
        return new Pegiun(this);
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
