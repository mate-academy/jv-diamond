package core.basesyntax;

import java.io.OutputStream;
import java.io.PrintStream;

public class StringStream extends PrintStream {
    private String printString = "";

    public StringStream(OutputStream stream) {
        super(stream);
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
