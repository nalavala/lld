package design_pattern.prototype.v1;

public class Pegiun extends Bird {

    private String height;

    public Pegiun() {

    }
    @Override
    public Bird clone() {
        Pegiun newPegiun = new Pegiun();
        newPegiun.height = this.height;
        return newPegiun;
    }
}
