package design_pattern.prototype.v1;

public class Crow extends Bird {
    private String sound;

    @Override
    public Bird clone() {
        Crow newCrow = new Crow();
        newCrow.sound = this.sound;
        return newCrow;

        // This is exact clone. Here we are not copying parent attributes as they are accessesable in child
        /*
        Solutions :
        1. Super() -> calling super doesn't helps. Parent might not have getter methods for all the  attributes
        2. getter and setter() -> Parent might not have getter methods for all the  attributes
         */
    }
}
