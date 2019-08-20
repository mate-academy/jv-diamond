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
        int i = 1;
        boolean check = true;
        if (maxSize == 1) {
            stream.print("*");
        } else {
            while (i > 0) {
                for (int j = 1; j < maxSize - i + 1; j++) {
                    stream.print(" ");
                }
                for (int j = 0; j < i * 2; j++) {
                    if ((j % 2) == 0) {
                        stream.print("*");
                    } else {
                        stream.print(" ");
                    }
                }
                if (check) {
                    i++;
                } else {
                    i--;
                }
                if (i == maxSize) check = false;
                if (!(!check && i == 0)) {
                    stream.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        drawDiamond(4, System.out);
    }
}
