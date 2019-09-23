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
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
