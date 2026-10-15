package pizza_builder;

import java.util.ArrayList;

enum SIZE {
    MEDIUM,
    SMALL,
    LARGE
}

public class Pizza {
    private String chain;
    private SIZE size;
    private ArrayList<String> toppings;

    Pizza(String chain, SIZE size, ArrayList<String> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.printf("Chain: %s\n", this.chain);

        System.out.print("Size: ");
        switch (this.size) {
            case SIZE.SMALL ->  System.out.println("Small");
            case SIZE.MEDIUM -> System.out.println("Medium");
            case SIZE.LARGE -> System.out.println("Large");
        }

        System.out.println("Selected toppings: ");
        for (int i = 0; i < this.toppings.size(); i++) {
            System.out.printf("%d) %s\n", i + 1, this.toppings.get(i));
        }
    }
}
