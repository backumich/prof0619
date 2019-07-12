package Task2;

import java.util.Random;

public class Apple implements IFruits {
    private int sweetness;
    private int wateriness;
    private String name = "Apple";
    int weigth = 250;

    Apple() {
        Random random = new Random();
        this.sweetness = random.nextInt(149) + 200;
        this.wateriness = random.nextInt(401) + 50;
        this.weigth = random.nextInt(151) + 150;
    }

    public int getSweetness() {
        return sweetness;
    }

    public int getWateriness() {
        return wateriness;

    }

    public int getWeight() {
        return weigth;
    }
}
