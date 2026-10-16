package abfactory_factory_singleton;

import java.util.ArrayList;

// Implementation of FatsFactory using both Factory & Singleton patterns
public class FatsFactory {
    // Singleton pattern implementation
    private static FatsFactory fatsFactory = null;
    private FatsFactory() {}
    public static FatsFactory getInstance() {
        if(fatsFactory == null) {
            fatsFactory = new FatsFactory();
        }

        return fatsFactory;
    }
    // ---------------------------------
    // Factory pattern implementation
    public static Fats getCarbs(DietPlan dietPlan) {
        ArrayList<Fats> itemsInPlan = new ArrayList<>();

        switch (dietPlan) {
            case NO_RESTRICTION:
                itemsInPlan.add(new Avocado());
                itemsInPlan.add(new SourCream());
                itemsInPlan.add(new Tuna());
                itemsInPlan.add(new Peanuts());
                break;
            case PALEO, VEGAN:
                itemsInPlan.add(new Avocado());
                itemsInPlan.add(new Tuna());
                itemsInPlan.add(new Peanuts());
                break;
            case NUT_ALLERGY:
                itemsInPlan.add(new Avocado());
                itemsInPlan.add(new SourCream());
                itemsInPlan.add(new Tuna());
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
