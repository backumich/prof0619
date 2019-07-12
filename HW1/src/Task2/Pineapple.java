package Task2;

import java.util.Random;

public class Pineapple implements IFruits {
    private int sweetness;
    private int wateriness;
    private String name = "Pineapple";
    private int weigth;


    Pineapple() {
        Random random = new Random();
        this.sweetness = random.nextInt(149) + 200;
        this.wateriness = random.nextInt(401) + 50;
        this.weigth = random.nextInt(401) + 450;
    }

    public int getSweetness() {
        return sweetness;
    }

    public int getWeight() {
        return weigth;
    }

    public int getWateriness() {
        return wateriness;
    }
}
