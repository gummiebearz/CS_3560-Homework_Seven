package abfactory_factory_singleton;

public class Customer {
    private final String name;
    private final DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return this.name;
    }

    public DietPlan getDietPlan() {
        return this.dietPlan;
    }
}