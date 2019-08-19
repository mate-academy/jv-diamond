package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    public static void drawDiamond(int maxSize, PrintStream stream) {
        int space = maxSize - 1;
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < space; j++) {
                stream.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
            space--;
        }
        space = 0;
        for (int i = maxSize; i > 0; i--) {
            for (int j = 0; j < space; j++) {
                stream.print(" ");
            }
            for (int j = 0; j < i; j++) {
                stream.print("* ");
            }
            stream.println();
            space++;
        }
    }

    public static void main(String[] args) {
        drawDiamond(3, System.out);
    }
}
