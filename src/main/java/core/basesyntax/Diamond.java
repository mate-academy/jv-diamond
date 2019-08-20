package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     *
     * <p></p>Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     *
     * <p></p>Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */
    public static void drawDiamond(int maxSize, PrintStream stream) {
        int count = maxSize - 1;

        //Top
        for (int i = 0; i < maxSize; i++) {

            for (int j = 0; j < count; j++) {
                stream.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                stream.print("* ");
            }
            stream.println();
            count--;
        }

        // Bottom
        count = 1;
        for (int i = maxSize - 1; i > 0; i--) {
            for (int j = 0; j < count; j++) {
                stream.print(" ");
            }

            for (int k = 0; k < i; k++) {
                stream.print("* ");
            }
            stream.println();
            count++;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}