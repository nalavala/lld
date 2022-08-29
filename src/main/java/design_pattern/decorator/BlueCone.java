package design_pattern.decorator;

public class BlueCone implements IceCreamCone {
    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String getConstituents() {
        return "blue cone";
    }
}
