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
        for (int i = 1; i < maxSize; i++) {
            for (int j = maxSize - i; j > 0; j--) {
                stream.print(" ");
            }
            for (int k = i; k > 0; k--) {
                stream.print("* ");
            }
            stream.println();
        }
        for (int i = maxSize - 1; i >= 0; i--) {
            for (int j = maxSize - i - 1; j > 0; j--) {
                stream.print(" ");
            }
            for (int k = i + 1; k > 0; k--) {
                stream.print("* ");
            }
            stream.println();
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
