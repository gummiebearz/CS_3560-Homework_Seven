package abfactory_factory_singleton;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        // Depend on the abstract type, never care what Diet Plan is
        MacronutrientFactory factory = MealFactory.getInstance();

        Customer[] customers = {
                new Customer("Ava", DietPlan.NO_RESTRICTION),
                new Customer("Adam", DietPlan.PALEO),
                new Customer("Bobby", DietPlan.VEGAN),
                new Customer("Mikayla", DietPlan.NUT_ALLERGY),
                new Customer("Amie", DietPlan.NO_RESTRICTION),
                new Customer("Ella", DietPlan.NUT_ALLERGY)
        };

        for(Customer customer : customers) {
            Meal meal = factory.createMeal(customer.getDietPlan());
            System.out.printf("Customer %s\n", customer.getName());
            switch (customer.getDietPlan()) {
                case NO_RESTRICTION:
                    System.out.print("Unrestricted diet: ");
                    break;
                case PALEO:
                    System.out.print("Paleo diet: ");
                    break;
                case VEGAN:
                    System.out.print("Vegan diet: ");
                    break;
                case NUT_ALLERGY:
                    System.out.print("Nut-allergy diet: ");
                    break;
                default:
                    System.out.println("Unknown diet!");
            }
            System.out.printf("%s\n\n", meal.toString());
        }
    }
}
