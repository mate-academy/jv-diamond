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
        int z = 1;
        for (int i = 0; i < maxSize / 2 + 1; i++) {
            int prob = (maxSize - z) / 2;

            for (int j = 0; j < prob; j++) {
                stream.print(" ");
            }
            for (int k = 0; k < z; k++) {
                stream.print("*");
            }
            stream.println();

            z = z + 2;
        }
        z = maxSize - 2;
        //===
        for (int i = maxSize / 2; i > 0; i--) {
            int prob = (maxSize - z) / 2;
            for (int j = 0; j < prob; j++) {
                stream.print(" ");
            }
            for (int k = 0; k < z; k++) {
                stream.print("*");
            }
            stream.println();
            z = z - 2;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
