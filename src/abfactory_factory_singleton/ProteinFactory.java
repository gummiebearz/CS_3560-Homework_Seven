package abfactory_factory_singleton;

import java.util.ArrayList;

// Implementation of ProteinFactory using both Factory & Singleton patterns
public class ProteinFactory {
    // Singleton pattern implementation
    private static ProteinFactory proteinFactory = null;
    private ProteinFactory() {}
    public static ProteinFactory getInstance() {
        if(proteinFactory == null) {
            return new ProteinFactory();
        }

        return proteinFactory;
    }
    // ---------------------------------
    // Factory pattern implementation
    public static Protein getProtein(DietPlan dietPlan) {
        ArrayList<Protein> itemsInPlan = new ArrayList<>();

        switch (dietPlan) {
            case NO_RESTRICTION, NUT_ALLERGY:
                itemsInPlan.add(new Fish());
                itemsInPlan.add(new Chicken());
                itemsInPlan.add(new Beef());
                itemsInPlan.add(new Tofu());
                break;
            case PALEO:
                itemsInPlan.add(new Fish());
                itemsInPlan.add(new Chicken());
                itemsInPlan.add(new Beef());
                break;
            case VEGAN:
                itemsInPlan.add(new Tofu());
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
