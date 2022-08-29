package design_pattern.decorator;

public class ButterScotchScoop implements  IceCreamCone {

    private IceCreamCone cone;

    public  ButterScotchScoop(IceCreamCone creamCone) {
        this.cone = creamCone;
    }
    @Override
    public double getCost() {
        return 12 + cone.getCost();
    }

    @Override
    public String getConstituents() {
        return cone.getConstituents() + "," + "butterscotch";
    }
}
