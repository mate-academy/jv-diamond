package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     *
     * <p>Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     *
     * <p>Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */
    public static void drawDiamond(int maxSize, PrintStream stream) {

        for (int i = 1; i < maxSize * 2; i++) {
            if (i <= maxSize) {
                for (int j = 1; j < maxSize - i + 1; j++) {
                    stream.print(" ");
                }
                for (int j = maxSize / 2 - i; j < maxSize / 2; j++) {
                    stream.print("* ");
                }
                stream.print("\n");
            }
            if (i > maxSize) {
                for (int j = 1; j <= i - maxSize; j++) {
                    stream.print(" ");
                }
                for (int j = maxSize * 2 - i; j >= 1; j--) {
                    stream.print("* ");
                }
                stream.print("\n");
            }
        }

    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
