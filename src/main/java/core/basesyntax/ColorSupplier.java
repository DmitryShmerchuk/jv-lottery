package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Colors getRandomColor() {

        Colors[] colors = Colors.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}
