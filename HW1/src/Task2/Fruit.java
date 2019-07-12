package Task2;

public abstract class Fruit {
    private int sweetness;
    private int wateriness;
    private String name;
    private int weigth;

    Fruit(int sweetness, int wateriness, String name, int weigth) {
        this.sweetness = sweetness;
        this.wateriness = wateriness;
        this.name = name;
        this.weigth = weigth;
    }

    public int getSweetness() {
        return sweetness;
    }

    public int getWateriness() {
        return wateriness;
    }

    public String getName() {
        return name;
    }

    public int getWeigth() {
        return weigth;
    }
}
