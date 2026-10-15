package abfactory_factory_singleton;

public abstract class Carbs {
    public abstract String getName();
}

class Cheese extends Carbs {
    @Override
    public String getName() {
        return "Cheese";
    }
}

class Bread extends Carbs {
    @Override
    public String getName() {
        return "Bread";
    }
}

class Lentils extends Carbs {
    @Override
    public String getName() {
        return "Lentils";
    }
}

class Pistachio extends Carbs {
    @Override
    public String getName() {
        return "Pistachio";
    }
}