package Markers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum MarkerTypes {
    RED,
    BLUE,
    BLACK;

    private static final List<MarkerTypes> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM_COLOR = new Random();

    public static MarkerTypes randomColor() {
        return VALUES.get(RANDOM_COLOR.nextInt(SIZE));
    }
}


