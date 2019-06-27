package core.basesyntax;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringStream extends PrintStream {
    private String printString = "";

    public StringStream() {
        super(new ByteArrayOutputStream());
    }

    @Override
    public void print(String s) {
        printString += s;
    }

    @Override
    public void println(String x) {
        printString += x + "\n";
    }

    @Override
    public void println() {
        printString += "\n";
    }

    public String getPrintString() {
        return printString;
    }
}
