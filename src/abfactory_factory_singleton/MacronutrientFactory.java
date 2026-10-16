package abfactory_factory_singleton;

// MacronutrientFactory implementation using Abstract Factory pattern
public abstract class MacronutrientFactory {
    public abstract CarbsFactory getCarbsFactory();
    public abstract ProteinFactory getProteinFactory();
    public abstract FatsFactory getFatsFactory();

    public Meal createMeal(DietPlan dietPlan) {
        return new Meal(this.getCarbsFactory().getCarbs(dietPlan), this.getProteinFactory().getProtein(dietPlan), this.getFatsFactory().getFats(dietPlan));
    }
}
