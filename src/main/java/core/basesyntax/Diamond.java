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
        String stringLine = "";

        for (int i = 1; i < maxSize; i++) {
            stringLine += " ".repeat(maxSize - i) + "* ".repeat(i) + "\n";
        }
        for (int i = maxSize; i >= 1; i--) {
            stringLine += " ".repeat(maxSize - i) + "* ".repeat(i) + "\n";
        }
        stream.print(stringLine);
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
