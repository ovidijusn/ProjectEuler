package lt.oworks.projecteuler.utils;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Ovidijus
 */
public class TestUtil {

    @Test
    public void testIsPrime() {
        assertFalse(Util.isPrime(1), "1 nera pirminis");
        assertTrue(Util.isPrime(2), "2 - pirminis");
        assertFalse(Util.isPrime(4), "4 - nëra pirminis");
        assertTrue(Util.isPrime(997), "997 - yra pirminis");
        assertFalse(Util.isPrime(100), "100 - nera pirminis");
    }

    @Test
    public void testFindDivisors() {
        long[] arr = {1};
        assertEquals(Util.findDivisors(1), arr, "1 has only 1");
        long[] arr2 = {1, 2};
        assertEquals(Util.findDivisors(2), arr2, "2 has 1, 2");
        long[] arr3 = {1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110, 220};
        assertEquals(Util.findDivisors(220), arr3);
        long[] arr4 = {1, 2, 4, 71, 142, 284};
        assertEquals(Util.findDivisors(284), arr4);

    }

    public TestUtil() {
    }

}
