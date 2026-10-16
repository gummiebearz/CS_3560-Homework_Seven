package pizza_builder;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Pizza firstPizza = new PizzaBuilder().setChain("Pizza Hut").setSize(SIZE.SMALL).addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").createPizza();

        Pizza secondPizza = new PizzaBuilder().setChain("Little Caesars").setSize(SIZE.MEDIUM).addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").addTopping("Onions").addTopping("Bacon").addTopping("Spinach").createPizza();

        Pizza thirdPizza = new PizzaBuilder().setChain("Dominos").setSize(SIZE.LARGE).addTopping("Pepperoni").addTopping("Sausage").addTopping("Mushrooms").addTopping("Onions").addTopping("Bacon").addTopping("Spinach").addTopping("Beef").addTopping("Ham").addTopping("Extra Cheese").createPizza();

        System.out.println("First pizza with 3 toppings:");
        System.out.println("----------------------------");
        firstPizza.eat();
        System.out.println("\nSecond pizza with 6 toppings:");
        System.out.println("-------------------------------");
        secondPizza.eat();
        System.out.println("\nThird pizza with 9 toppings:");
        System.out.println("------------------------------");
        thirdPizza.eat();
        System.out.println();

        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        System.out.println("Purchasing Pizzas");
        System.out.println("-----------------");
        // Adding Pizza Hut chains
        pizzas.add(new PizzaBuilder().setChain("Pizza Hut").setSize(SIZE.LARGE).addTopping("Pepperoni").addTopping("Peppers").addTopping("Ham").createPizza());
        pizzas.add(new PizzaBuilder().setChain("Pizza Hut").setSize(SIZE.SMALL).addTopping("Pepperoni").addTopping("Peppers").createPizza());

        // Adding Little Caesars chains
        pizzas.add(new PizzaBuilder().setChain("Little Caesars").setSize(SIZE.MEDIUM).addTopping("Pepperoni").addTopping("Peppers").addTopping("Ham").addTopping("Sausage").addTopping("Chicken").addTopping("Pesto").addTopping("Mushrooms").addTopping("Olives").createPizza());
        pizzas.add(new PizzaBuilder().setChain("Little Caesars").setSize(SIZE.SMALL).addTopping("Pepperoni").addTopping("Peppers").addTopping("Ham").addTopping("Sausage").addTopping("Chicken").addTopping("Pesto").createPizza());

        // Adding Dominos chains
        pizzas.add(new PizzaBuilder().setChain("Dominos").setSize(SIZE.SMALL).addTopping("Pepperoni").createPizza());
        pizzas.add(new PizzaBuilder().setChain("Pizza Hut").setSize(SIZE.LARGE).addTopping("Pepperoni").addTopping("Peppers").addTopping("Ham").createPizza());

        // Eat all the pizzas
        for(Pizza pizza : pizzas) {
            pizza.eat();
            System.out.println();
        }
    }
}
