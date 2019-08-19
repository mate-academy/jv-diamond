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
        int i = 1;
        boolean check = true;
        while (i > 0){
            for (int j = 0; j<maxSize - i + 1; j++) {
                stream.print(" ");
            }
            for (int j = 0; j < i; j++){
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
        }
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
