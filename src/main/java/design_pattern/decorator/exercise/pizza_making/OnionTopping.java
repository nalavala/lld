package design_pattern.decorator.exercise.pizza_making;

public class OnionTopping implements Pizza{

    public Pizza pizza;

    public OnionTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Double getCost() {
        return 20 + pizza.getCost();
    }

    @Override
    public String getConstituents() {
        return pizza.getConstituents() + "," + "cheese";
    }

}
