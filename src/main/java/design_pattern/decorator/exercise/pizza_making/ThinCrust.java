package design_pattern.decorator.exercise.pizza_making;

public class ThinCrust extends PizzaBase {

    private PizzaBase base;

    public ThinCrust(PizzaBase pizzaBase) {
        this.base = pizzaBase;
    }

    public ThinCrust() {

    }

    @Override
    public Double getCost() {
        return base != null ? 24 + base.getCost() : 24;
    }

    @Override
    public String getConstituents() {
        return base != null ? base.getConstituents() + "," + "thin crust" : "thin crust";
    }
}
