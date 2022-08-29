package design_pattern.decorator.exercise.pizza_making;

public class PanCrust extends PizzaBase {

    private PizzaBase base;

    public PanCrust(PizzaBase pizzaBase) {
        this.base = pizzaBase;
    }

    public PanCrust() {

    }

    @Override
    public Double getCost() {
        return base != null ? 24 + base.getCost() : 24;
    }

    @Override
    public String getConstituents() {
        return base != null ? base.getConstituents() + "," + "pan crust" : "pan crust";
    }
}
