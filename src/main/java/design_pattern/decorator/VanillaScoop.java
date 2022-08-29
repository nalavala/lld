package design_pattern.decorator;

public class VanillaScoop implements IceCreamCone {
    private IceCreamCone cone;

    public VanillaScoop(IceCreamCone iceCreamCone) {
        this.cone = iceCreamCone;
    }
    @Override
    public double getCost() {
        return 5 + cone.getCost();
    }

    @Override
    public String getConstituents() {
        return cone.getConstituents() + "," + "vanilla";
    }
}
