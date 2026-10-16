package abfactory_factory_singleton;

import java.util.ArrayList;

// Implementation of CarbsFactory using both Factory & Singleton patterns
public class CarbsFactory {
    // Singleton pattern implementation
    private static CarbsFactory carbsFactory = null;
    private CarbsFactory() {}
    public static CarbsFactory getInstance() {
        if(carbsFactory == null) {
            carbsFactory = new CarbsFactory();
        }

        return carbsFactory;
    }
    // ---------------------------------
    // Factory pattern implementation
    public static Carbs getCarbs(DietPlan dietPlan) {
        ArrayList<Carbs> itemsInPlan = new ArrayList<>();

        switch (dietPlan) {
            case NO_RESTRICTION:
                itemsInPlan.add(new Cheese());
                itemsInPlan.add(new Bread());
                itemsInPlan.add(new Lentils());
                itemsInPlan.add(new Pistachio());
                break;
            case PALEO:
                itemsInPlan.add(new Pistachio());
                break;
            case VEGAN:
                itemsInPlan.add(new Bread());
                itemsInPlan.add(new Lentils());
                itemsInPlan.add(new Pistachio());
                break;
            case NUT_ALLERGY:
                itemsInPlan.add(new Cheese());
                itemsInPlan.add(new Bread());
                itemsInPlan.add(new Lentils());
                break;
            default:
                System.err.println("Unknown diet");
        }

        // Generate a random index between 0 and list length - 1
        int randomIndex = (int)(Math.random() * itemsInPlan.size());
        // Return a randomly selected item
        return itemsInPlan.get(randomIndex);
    }
}
