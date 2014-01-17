package lt.oworks.projecteuler.utils;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author Ovidijus
 */
public class DivisionNGTest {

    public DivisionNGTest() {
    }

    @Test
    public void testFindDivisors() {
        long[] arr = {1};
        assertEquals(Division.findDivisors(1), arr, "1 has only 1");
        long[] arr2 = {1, 2};
        assertEquals(Division.findDivisors(2), arr2, "2 has 1, 2");
        long[] arr3 = {1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110, 220};
        assertEquals(Division.findDivisors(220), arr3);
        long[] arr4 = {1, 2, 4, 71, 142, 284};
        assertEquals(Division.findDivisors(284), arr4);
    }

    @Test
    public void testCountDivisors() {
        assertEquals(Division.countDivisors(10), 4);
        assertEquals(Division.countDivisors(5), 2);
    }

    @Test
    public void testIsPrime() {
        assertFalse(Division.isPrime(1), "1 nera pirminis");
        assertTrue(Division.isPrime(2), "2 - pirminis");
        assertFalse(Division.isPrime(4), "4 - n\u0117ra pirminis");
        assertTrue(Division.isPrime(997), "997 - yra pirminis");
        assertFalse(Division.isPrime(100), "100 - nera pirminis");
        assertFalse(Division.isPrime(0), "0 - nera pirminis");
    }

    @Test
    public void testDbd() {
        assertEquals(Division.dbd(3, 6), 3);
        assertEquals(Division.dbd(3, 0), 3);
        assertEquals(Division.dbd(30, 45), 15);
    }

    @Test
    public void testSsAbundant() {
        final long[] abundants = {12, 18, 20, 24, 100};
        final long[] nonAbundants = {11, 17, 11, 25, 99};
        for (final long n : abundants) {
            assertTrue(Division.isAbundant(n), n + " is abundant number.");
        }
        for (final long n : nonAbundants) {
            assertFalse(Division.isAbundant(n), n + " isn't abundant number.");
        }
    }

    @Test
    public void testFindPrimeDivisors() {
        assertEquals(Division.findPrimeDivisors(6), new long[]{2, 3});
        assertEquals(Division.findPrimeDivisors(30), new long[]{2, 3, 5});
        assertEquals(Division.findPrimeDivisors(7), new long[]{7});
    }

}
