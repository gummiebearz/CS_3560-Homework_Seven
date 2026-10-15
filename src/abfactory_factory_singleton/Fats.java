package abfactory_factory_singleton;

public abstract class Fats {
    public abstract String getName();
}

class Avocado extends Fats {
    @Override
    public String getName() {
        return "Avocado";
    }
}

class SourCream extends Fats {
    @Override
    public String getName() {
        return "Sour Cream";
    }
}

class Tuna extends Fats {
    @Override
    public String getName() {
        return "Tuna";
    }
}

class Peanuts extends Fats {
    @Override
    public String getName() {
        return "Peanuts";
    }
}