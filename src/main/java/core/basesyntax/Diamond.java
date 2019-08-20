package core.basesyntax;

import java.io.PrintStream;
import java.util.Arrays;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println().
     */
    public static void drawDiamond(int maxSize, PrintStream stream) {
        int leftBorder = maxSize - 1;
        int rightBorder = maxSize - 1;
        int lineSize = maxSize;
        for (int i = 1; i < maxSize * 2; i++) {
            char[] line = new char[lineSize];
            Arrays.fill(line, ' ');
            if (i == 1 || i == maxSize * 2 - 1) {
                line[maxSize - 1] = '*';
            } else if (i <= maxSize) {
                line[--leftBorder] = '*';
                line[++rightBorder] = '*';
            } else {
                line[++leftBorder] = '*';
                line[--rightBorder] = '*';
            }
            if (leftBorder != rightBorder && i != maxSize * 2 - 1) {
                int leftFilling = leftBorder;
                int rightFilling = rightBorder;
                while (leftFilling != rightFilling - 2 && rightFilling != leftFilling + 2
                        && leftFilling != rightFilling) {
                    leftFilling += 2;
                    rightFilling -= 2;
                    line[leftFilling] = '*';
                    line[rightFilling] = '*';
                }
            }
            lineSize++;
            String string = new String(line);
            stream.println(string);
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
