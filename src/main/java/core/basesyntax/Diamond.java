package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * <p>Нарисовать ромб со звёздочек заданной величины.
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()</p>
     */
    public static void drawDiamond(int maxSize, PrintStream stream) {
        int indexSpace = 1;
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize - indexSpace; j++) {
                stream.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                stream.print("* ");
            }
            stream.println();
            indexSpace++;
        }
        indexSpace = 1;
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < indexSpace; j++) {
                stream.print(" ");
            }
            for (int k = 0; k < maxSize - indexSpace; k++) {
                stream.print("* ");
            }
            stream.println();
            indexSpace++;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
