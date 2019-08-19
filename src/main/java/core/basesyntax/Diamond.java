package core.basesyntax;

import java.io.PrintStream;

public class Diamond {
    /**
     * Нарисовать ромб со звёздочек заданной величины.
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */
    public static void drawDiamond(int n, PrintStream stream) {
        if (n <= 0) {
            stream.println("Invalid value of n");
            return;
        }
        int spaces = n - 1;
        int parts = 1;

        for (int i = 1; i < n * 2; i++) {
            for (int j = 0; j < spaces; j++) {
                stream.print(" ");
            }
            for (int j = 0; j < parts; j++) {
                stream.print("* ");
            }
            stream.println();
            spaces = i < n ? --spaces : ++spaces;
            parts = i < n ? ++parts : --parts;
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
