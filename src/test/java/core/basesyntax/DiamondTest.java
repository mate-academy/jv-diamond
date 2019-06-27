package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class DiamondTest {
    private static final String ONE_STAR = "*";

    private static final String EVEN_NUMBER_OF_STAR =
                      "   *\n"
                    + "  * *\n"
                    + " * * *\n"
                    + "* * * *\n"
                    + " * * *\n"
                    + "  * *\n"
                    + "   *";

    private static final String ODD_NUMBER_OF_STAR =
                      "    *\n"
                    + "   * *\n"
                    + "  * * *\n"
                    + " * * * *\n"
                    + "* * * * *\n"
                    + " * * * *\n"
                    + "  * * *\n"
                    + "   * *\n"
                    + "    *";

    @Test
    public void shouldPrintOneStarDiamondCorrectly() {
        StringStream actualPrintStream = new StringStream();
        Diamond.drawDiamond(1, actualPrintStream);
        String actualResult = actualPrintStream.getPrintString().trim();
        Assert.assertEquals("Test failed with parameter: maxSize = " + 1,
                ONE_STAR,
                actualResult);
    }

    @Test
    public void shouldPrintEvenStarDiamondCorrectly() {
        StringStream actualPrintStream = new StringStream();
        Diamond.drawDiamond(4, actualPrintStream);
        assertTrimmedDiamondsEqual(actualPrintStream, EVEN_NUMBER_OF_STAR, 4);
    }

    @Test
    public void shouldPrintOddStarDiamondCorrectly() {
        StringStream actualPrintStream = new StringStream();
        Diamond.drawDiamond(5, actualPrintStream);
        assertTrimmedDiamondsEqual(actualPrintStream, ODD_NUMBER_OF_STAR, 5);
    }

    private void assertTrimmedDiamondsEqual(StringStream actualPrintStream, String expected, int maxSize) {
        String[] actualResult = actualPrintStream.getPrintString().split("\n");
        String[] expectedResult = expected.split("\n");
        for (int i = 0; i < actualResult.length; i++) {
            if (!actualResult[i].isBlank()) {
                actualResult[i] = actualResult[i].replaceAll("\\s+$", "");
                Assert.assertEquals("Test failed with parameter: maxSize = " + maxSize,
                        expectedResult[i],
                        actualResult[i]);
            }
        }
    }
}
