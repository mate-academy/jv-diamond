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
        maxSize = maxSize*2-1;
        int middle = (maxSize)/2;
        int row = 1;
        for (int i = middle; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                stream.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                stream.print("* ");
            }
            stream.println();
            row++;
        }

        for (int i = 0; i <= middle; i++) {
            for (int j = 1; j <= i; j++) {
                stream.print(" ");
            }
            for (int j = row; j > 0; j--) {
                stream.print("* ");
            }
            stream.println();
            row--;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
