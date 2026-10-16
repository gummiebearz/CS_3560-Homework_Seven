package pizza_builder;

import java.util.ArrayList;

public class PizzaBuilder {
    private String chain;
    private SIZE size;
    private ArrayList<String> toppings;

    public PizzaBuilder() {
        this.toppings = new ArrayList<>();
    }

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(SIZE size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza createPizza() {
        // Enforce size requirement
        if(this.size == null) {
            throw new IllegalArgumentException("Pizza size is required");
        }

        return new Pizza(this.chain, this.size, this.toppings);
    }
}
