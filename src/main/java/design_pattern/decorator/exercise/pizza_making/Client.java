package design_pattern.decorator.exercise.pizza_making;

public class Client {
    public static void main(String[] args) {
        // Multiple base but not sandwich
       Pizza pizza = new CheeseTopping(new CheeseTopping(new PanCrust(new ThinCrust())));
        System.out.println(pizza.getConstituents());
    }
}
