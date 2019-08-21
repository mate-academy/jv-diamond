package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     *
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     *
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */
    public static void drawDiamond(int maxSize, PrintStream stream) {
        if (maxSize <= 0) {
            stream.println("maxSize can`t be negative");
            return;
        }
        int spaces = maxSize - 1;
        int stars = 1;

        for (int i = 1; i < maxSize * 2; i++) {
            for (int j = 0; j < spaces; j++) {
                stream.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                stream.print("* ");
            }
            stream.println();
            spaces = i < maxSize ? --spaces : ++spaces;
            stars = i < maxSize ? ++stars : --stars;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
