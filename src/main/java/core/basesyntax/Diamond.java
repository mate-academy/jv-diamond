package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     * <p>
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     * <p>
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */
    public static void drawDiamond(int n, PrintStream stream) {


        StringBuilder all = new StringBuilder(2 * n * 2 * n);
        StringBuilder temp = new StringBuilder(2 * n);
        int offset = 0;
        int j = n - 1;

        for (int i = j; i > 0; i--) {
            temp.append(" ".repeat(i));
            temp.append("* ".repeat(j - i));
            temp.append("*\n");
            all.insert(offset, temp);
            offset += temp.length();
            if (j - i == 0) {
                temp.deleteCharAt(temp.length() - 1);
            }
            all.insert(offset, temp);
            temp.setLength(0);
        }

        temp.append("* ".repeat(n - 1));
        temp.append("*\n");
        all.insert(offset, temp);
        stream.print(all.toString());

    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
