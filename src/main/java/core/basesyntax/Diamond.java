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
      if (maxSize % 2 == 0 || maxSize < 0) {
      stream.print(null);
    }
    String[] asterisks = new String[maxSize/2 + 1];
    asterisks[0] = "*\maxSize";
    for(int i = 1; i < asterisks.length; i ++) {
      asterisks[i] = "**" + asterisks[i - 1];
    }
    String[] spaces = new String[maxSize/2 + 1];
    spaces[0] = "";
    for(int i = 1; i < spaces.length; i ++) {
      spaces[i] = " " + spaces[i - 1];
    }
    String diamond = "";
    for (int i = 0; i < maxSize/2 + 1; i ++) {
      diamond += spaces[spaces.length - i - 1] + asterisks[i];
    }
    for (int i = 1; i < n/2 + 1; i ++) {
      diamond += spaces[i] + asterisks[asterisks.length - i - 1];
    }
    stream.print(diamond);
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
