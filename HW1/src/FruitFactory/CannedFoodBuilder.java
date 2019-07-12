package FruitFactory;

public class CannedFoodBuilder {

    private CannedFood newCanned;
    private IFruits fruits;

    public CannedFoodBuilder() {
        newCanned = new CannedFood();
    }

    public CannedFoodBuilder withName(String name) {
        newCanned.setName(name);
        return this;
    }

    public CannedFoodBuilder withWater(int water) {
        newCanned.setAddWater(water);
        return this;
    }

    public CannedFoodBuilder withSugar(int sugar) {
        newCanned.setAddSugar(sugar);
        return this;
    }
}
