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
        int a = 1;

        for (int i = 0; i <= maxSize; i++) {
            for (int j = 0; j < maxSize-i; j++) {
                stream.print(" ");
            }
            for (int k = 0; k < i ; k++) {
                stream.print(" *");
            }
            System.out.println();
        }

        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < a; j++) {
                stream.print(" ");
            }
            for (int k = 0; k < maxSize-a; k++) {
                stream.print(" *");
            }
            stream.println();
            a++;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
