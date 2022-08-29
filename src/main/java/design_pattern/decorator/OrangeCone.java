package design_pattern.decorator;

public class OrangeCone implements IceCreamCone {


    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getConstituents() {
        return "Orange cone";
    }
}
