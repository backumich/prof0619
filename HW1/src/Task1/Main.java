package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Drawer drawer = new Drawer();
        Scanner in = new Scanner(System.in);
        Teacher teacher = new Teacher();
        String text = "С другой стороны новая модель организационной деятельности в значительной степени обуславливает создание существенных финансовых и административных условий.";
        teacher.input(text);

    }
}
