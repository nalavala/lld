package design_pattern.decorator;

public class Client {

    public static void main(String ars[]) {
        IceCreamCone cone = new VanillaScoop(new ButterScotchScoop(new OrangeCone()));
        System.out.println(cone.getConstituents());
        System.out.println(cone.getCost());
    }

}
