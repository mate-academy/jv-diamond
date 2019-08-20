package core.basesyntax;

import java.io.PrintStream;

class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */
    public static void drawDiamond(int maxSize, PrintStream stream) {
        for (int i = 0; i < 2 * maxSize; i++) {
            int right = -Math.abs(i - maxSize) + 2 * maxSize - 1;
            for (int x = 0; x <= right; x++) {
                int low = Math.abs(x - maxSize + 1);
                int top = -Math.abs(x - maxSize + 1) + 2 * maxSize - 2;
                if (i >= low && i <= top && (i + x) % 2 != maxSize % 2) {
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
