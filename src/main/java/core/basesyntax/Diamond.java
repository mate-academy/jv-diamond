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
        for (int y = 0; y < 2 * maxSize; y++) {
            int rightEdge = -Math.abs(y - maxSize) + 2 * maxSize - 1;
            for (int x = 0; x <= rightEdge; x++) {
                int lowEdge = Math.abs(x - maxSize + 1);
                int topEdge = -Math.abs(x - maxSize + 1) + 2 * maxSize - 2;
                if (y >= lowEdge && y <= topEdge && (x + y) % 2 != maxSize % 2) {
                    stream.print("*");
                } else {
                    stream.print(" ");
                }
            }
            stream.println();
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
