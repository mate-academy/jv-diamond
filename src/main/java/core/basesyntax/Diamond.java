package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     *
     * <p>Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.</p>
     * Вместо System.out.print() или System.out.println() использовать stream.print() или
     * stream.println()
     */
    public static void drawDiamond(int maxSize, PrintStream stream) {
        int spaceCount = maxSize - 1;

        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < spaceCount; j++) {
                stream.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
            spaceCount--;
        }

        spaceCount = 0;
        for (int i = maxSize - 1; i > 0; i--) {
            for (int j = 0; j <= spaceCount; j++) {
                stream.print(" ");
            }

            for (int j = 0; j < i; j++) {
                stream.print("* ");
            }
            stream.println();
            spaceCount++;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
