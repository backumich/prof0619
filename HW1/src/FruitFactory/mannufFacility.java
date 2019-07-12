package FruitFactory;

public class mannufFacility {
    private AllFruits fruits;

    private mannufFacility(AllFruits fruits) {
        switch (fruits) {
            case APPLE:
                System.out.println("Making apple canned!");
                break;
            case PEAR:
                System.out.println("Making pear canned!");
                break;
            case PINEAPPLE:
                System.out.println("Making pineapple canned!");
                break;
            case FRUIT:
                break;
        }
    }

    public static final mannufFacility INSTANCE = new mannufFacility();
}
