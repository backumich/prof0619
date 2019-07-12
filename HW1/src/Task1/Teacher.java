package Task1;

import java.util.ArrayList;

public class Teacher extends Drawer {

    Drawer drawer = new Drawer();

    Teacher() {
        drawer.getNewMarker();
    }

    private void toInput(String text) {

        int wQ = wordQuantity(text);
        int maxWQ = drawer.getMarker().maxWordQuantity();
        System.out.println("You can input " + maxWQ + " words with this marker.");
        System.out.println(text);
        System.out.println("You want to input " + wQ + " words.");
        if (maxWQ > wQ) {
            maxWQ -= wQ;
            System.out.println("You wrote " + wQ + " words.");
            System.out.println(maxWQ + " words left");
            textToList(text, maxWQ);
        } else while (maxWQ < wQ) {
            System.out.println("Your marker is empty, you took the other one");
            System.out.println("You wrote " + maxWQ + " words.");
            textToList(text, maxWQ);
            wQ -= maxWQ;
            System.out.println(wQ + " words left to write.");
            drawer.getNewMarker();
            maxWQ = drawer.getMarker().maxWordQuantity();
        }

        System.out.println("You wrote the sentence!");

    }

    private int wordQuantity(String text) {
        int wordQuantity = 0;

        if (text.length() != 0) {
            wordQuantity++;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    wordQuantity++;
                }
            }
        }
        return wordQuantity;
    }

//    private void textToList (String text, int wordQuantity) {
//        String color = drawer.getMarker().color();
//        String[] publicArray = text.split("\\s");
//        StringBuilder builder = new StringBuilder();
//        int z = 0;
//        for (int i = z; i < wordQuantity; i++) {
//            builder.append(publicArray[z]).append(' ');
//            z++;
//        }
//        System.out.println("<".concat(color).concat(">").concat(builder.toString()).concat("</").concat(color).concat(">"));
//        builder.delete(0, z);
//    }

    private void textToList(String text, int wordQuantity) {
        String color = drawer.getMarker().color();
        ArrayList<String> a = abc(text);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < wordQuantity; i++) {
            builder.append(a).append(' ');
            builder.deleteCharAt(i);
        }
        System.out.println("<".concat(color).concat(">").concat(builder.toString()).concat("</").concat(color).concat(">"));
    }


    public void input(String text) {
        toInput(text);
    }

    public ArrayList<String> abc(String text) {
        ArrayList<String> list = new ArrayList<>();
        String[] pa = text.split("\\s");
        for (int i = 0; i < pa.length; i++) {
            list.add(pa[i]);
        }
        return list;
    }
}
