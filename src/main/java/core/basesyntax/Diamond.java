package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */

    public static void drawDiamond(int maxSize, PrintStream stream) {
        for (int i = 0; i < maxSize; i++) {
            for (int y = 0; y < maxSize - i; y++) {
                stream.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
        }
        for (int i = maxSize; i >= 0; i--) {
            for (int y = 0; y < maxSize - i; y++) {
                stream.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }

}
