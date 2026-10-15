package abfactory_factory_singleton;

interface FoodItem {
    String getName();
}

interface Carbs extends FoodItem {}
interface Protein extends FoodItem {}
interface Fats extends FoodItem {}

class Cheese implements Carbs {
    @Override
    public String getName() {
        return "Cheese";
    }
}

class Bread implements Carbs {
    @Override
    public String getName() {
        return "Bread";
    }
}

class Lentils implements Carbs {
    @Override
    public String getName() {
        return "Lentils";
    }
}

class Pistachio implements Carbs {
    @Override
    public String getName() {
        return "Pistachio";
    }
}

class Fish implements Protein {
    @Override
    public String getName() {
        return "Fish";
    }
}

class Chicken implements Protein {
    @Override
    public String getName() {
        return "Chicken";
    }
}

class Beef implements Protein {
    @Override
    public String getName() {
        return "Beef";
    }
}

class Tofu implements Protein {
    @Override
    public String getName() {
        return "Tofu";
    }
}

class Avocado implements Fats {
    @Override
    public String getName() {
        return "Avocado";
    }
}

class SourCream implements Fats {
    @Override
    public String getName() {
        return "Sour Cream";
    }
}

class Tuna implements Fats {
    @Override
    public String getName() {
        return "Tuna";
    }
}

class Peanuts implements Fats {
    @Override
    public String getName() {
        return "Peanuts";
    }
}