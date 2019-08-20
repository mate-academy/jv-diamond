package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */
    public static void drawDiamond(int sizeS, PrintStream stream) {
        int emptyDots = sizeS - 1;
        for (int i = 0; i < sizeS; i++) {
            for (int j = 0; j < emptyDots; j++) {
                stream.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
            emptyDots--;
        }
        emptyDots = 0;
        for (int i = sizeS - 1; i > 0; i--) {
            for (int j = 0; j <= emptyDots; j++) {
                stream.print(" ");
            }

            for (int j = 0; j < i; j++) {
                stream.print("* ");
            }

            stream.println();
            emptyDots++;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
