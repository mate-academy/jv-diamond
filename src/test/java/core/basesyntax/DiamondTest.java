package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DiamondTest {
    private static final String ONE_STAR = "* \n";

    private static final String EVEN_NUMBER_OF_STAR =
                      "   * \n"
                    + "  * * \n"
                    + " * * * \n"
                    + "* * * * \n"
                    + " * * * \n"
                    + "  * * \n"
                    + "   * \n";

    private static final String ODD_NUMBER_OF_STAR =
                      "    * \n"
                    + "   * * \n"
                    + "  * * * \n"
                    + " * * * * \n"
                    + "* * * * * \n"
                    + " * * * * \n"
                    + "  * * * \n"
                    + "   * * \n"
                    + "    * \n";

    @Test
    public void oneStarScenario() {
        try {
            StringStream actualPrintStream = new StringStream(new FileOutputStream("file"));
            Diamond.drawDiamond(1, actualPrintStream);

            Assert.assertEquals("Test failed with parameter: maxSize = " + 1,
                    ONE_STAR,
                    actualPrintStream.getPrintString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void evenStarScenario() {
        try {
            StringStream actualPrintStream = new StringStream(new FileOutputStream("file"));
            Diamond.drawDiamond(4, actualPrintStream);

            Assert.assertEquals("Test failed with parameter: maxSize = " + 4,
                    EVEN_NUMBER_OF_STAR,
                    actualPrintStream.getPrintString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void oddStarScenario() {
        try {
            StringStream actualPrintStream = new StringStream(new FileOutputStream("file"));
            Diamond.drawDiamond(5, actualPrintStream);

            Assert.assertEquals("Test failed with parameter: maxSize = " + 5,
                    ODD_NUMBER_OF_STAR,
                    actualPrintStream.getPrintString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
