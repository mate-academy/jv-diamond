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
        StringBuilder diamond = new StringBuilder(2 * maxSize * 2 * maxSize);
        StringBuilder line = new StringBuilder(2 * maxSize);
        int offset = 0;
        int j = maxSize - 1;
        for (int i = j; i > 0; i--) {
            line.append(" ".repeat(i));
            line.append("* ".repeat(j - i));
            line.append("*\n");
            diamond.insert(offset, line);
            offset += line.length();
            if (j - i == 0) {
                line.deleteCharAt(line.length() - 1);
            }
            diamond.insert(offset, line);
            line.setLength(0);
        }

        line.append("* ".repeat(maxSize - 1));
        line.append("*\n");
        diamond.insert(offset, line);
        stream.print(diamond.toString());
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
