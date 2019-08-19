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
    public static void drawDiamond(int n, PrintStream stream) {

    	if( n < 1 || n%2 == 0 ) throw new IllegalArgumentException("maxSize must be odd positive number");
        StringBuilder all = new StringBuilder(n*n);
        StringBuilder temp = new StringBuilder(n);
        int offset = 0; int j = ( n + 1 ) / 2;
        
        for(int i = j  -  1; i > 0; i--, j++ ){
            temp.append(" ".repeat(i));
            temp.append("*".repeat(j - i));
            temp.append("\n");
            all.insert(offset,temp);
            offset+=temp.length();
            all.insert(offset,temp);
            temp.setLength(0);
        }
        
        temp.append("*".repeat(n));
        temp.append("\n");
        st.insert(offset,temp);
        stream.print(all.toString());

    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
