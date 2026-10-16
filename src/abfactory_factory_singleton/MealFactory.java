package abfactory_factory_singleton;

// Concrete Meal Factory
// Extends the Abstract Factory pattern from MacronutrientFactory
// and implements Singleton pattern
public class MealFactory extends MacronutrientFactory {
    // Singleton pattern implementation
    private static MealFactory mealFactory = null;
    private MealFactory() {}
    public static MealFactory getInstance() {
        if(mealFactory == null) {
            mealFactory = new MealFactory();
        }

        return mealFactory;
    }

    // Overriding abstract methods from MacronutrientFactory
    @Override
    public CarbsFactory getCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    @Override
    public ProteinFactory getProteinFactory() {
        return ProteinFactory.getInstance();
    }

    @Override
    public FatsFactory getFatsFactory() {
        return FatsFactory.getInstance();
    }
}
