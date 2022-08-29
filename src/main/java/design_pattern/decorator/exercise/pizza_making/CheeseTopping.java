package design_pattern.decorator.exercise.pizza_making;

public class CheeseTopping implements Pizza {
    public Pizza pizza;

    public CheeseTopping(Pizza pizza) {
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
