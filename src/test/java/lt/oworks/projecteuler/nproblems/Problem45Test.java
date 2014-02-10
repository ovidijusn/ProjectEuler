package lt.oworks.projecteuler.nproblems;

import lt.oworks.projecteuler.nproblems.impl.Problem45;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author narkeovi
 */
public class Problem45Test {

    final long[] numbersT = {1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 120};
    final long[] numbersH = {1, 6, 15, 28, 45, 66, 91, 120, 153, 190, 231, 276, 325, 378, 435, 496, 561, 630, 703, 780, 861, 946};

    public Problem45Test() {
    }

    @Test
    public void testIsTriangularNumber() {

        for (final long num : numbersT) {
            assertTrue(Problem45.isTriangularNumber(num), num + " is Triangular Number");
        }
        for (final long num : numbersT) {
            assertFalse(Problem45.isTriangularNumber(num + 1), num + " isn't Triangular Number");
        }
    }

    @Test
    public void testIsHexagonalNumber() {

        for (final long num : numbersH) {
            assertTrue(Problem45.isHexagonalNumber(num), num + " is Hexagonal Number");
        }
        for (final long num : numbersH) {
            assertFalse(Problem45.isHexagonalNumber(num + 1), num + " isn't Hexagonal Number");
        }
    }

    @Test
    public void testGetTriangularNumber() {

        for (int i = 1; i <= numbersT.length; i++) {
            assertEquals(Problem45.getTriangularNumber(i), numbersT[i - 1]);
        }
    }

    @Test
    public void testGetHexagonalNumber() {

        for (int i = 1; i <= numbersH.length; i++) {
            assertEquals(Problem45.getHexagonalNumber(i), numbersH[i - 1]);
        }
    }
}
