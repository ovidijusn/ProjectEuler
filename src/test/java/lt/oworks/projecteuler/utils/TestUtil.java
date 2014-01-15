package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;
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

    @Test
    public void testAddAll() {
        long[] arr = {};
        assertEquals(Util.addAll(), 0);
        long[] arr2 = {1, 2};
        assertEquals(Util.addAll(arr2), 3);
        assertEquals(Util.addAll(1, 2, 3, 4, 5), 1 + 2 + 3 + 4 + 5);
    }

    @Test
    public void testSsAbundant() {
        final long[] abundants = {12, 18, 20, 24, 100};
        final long[] nonAbundants = {11, 17, 11, 25, 99};
        for (final long n : abundants) {
            assertTrue(Util.isAbundant(n), n + " is abundant number.");
        }

        for (final long n : nonAbundants) {
            assertFalse(Util.isAbundant(n), n + " isn't abundant number.");
        }
    }

    @Test
    public void testIsPandigital() {
        assertTrue(Util.isPandigital(1, 1), "1");
        assertTrue(Util.isPandigital(12, 2), "12");
        assertTrue(Util.isPandigital(123, 3), "123");
        assertTrue(Util.isPandigital(1234, 4), "1234");
        assertTrue(Util.isPandigital(12345, 5), "12345");

        assertFalse(Util.isPandigital(2, 1), "2");
        assertFalse(Util.isPandigital(22, 2), "22");
        assertFalse(Util.isPandigital(124, 3), "124");
        assertFalse(Util.isPandigital(1111, 4), "1111");
        assertFalse(Util.isPandigital(12355, 5), "12355");
    }

    @Test
    public void testFindPrimeDivisors() {
        assertEquals(Util.findPrimeDivisors(6), new long[]{2, 3});
        assertEquals(Util.findPrimeDivisors(30), new long[]{2, 3, 5});
        assertEquals(Util.findPrimeDivisors(7), new long[]{7});
    }

    @Test
    public void testMultiplyAll() {
        assertEquals(Util.multiplyAll(1, 2, 3), 6);
        assertEquals(Util.multiplyAll(1, 2, 3, 4), 24);
        assertEquals(Util.multiplyAll(1, 2, -3), -6);
        assertEquals(Util.multiplyAll(1, 2, 3, 0), 0);
    }

    @Test
    public void testCountDivisors() {
        assertEquals(Util.countDivisors(10), 4);
        assertEquals(Util.countDivisors(5), 2);
    }

    @Test
    public void testDigitSum() {
        assertEquals(Util.factorial(BigDecimal.ONE), BigDecimal.ONE);
        assertEquals(Util.factorial(new BigDecimal(3)), new BigDecimal(6));
    }

    @Test
    public void testFactorial() {
        assertEquals(Util.digitSum(BigDecimal.ONE), BigDecimal.ONE);
        assertEquals(Util.digitSum(new BigDecimal(315)), new BigDecimal(9));
    }

    @Test
    public void testDbd() {
        assertEquals(Util.dbd(3, 6), 3);
        assertEquals(Util.dbd(3, 0), 3);
        assertEquals(Util.dbd(30, 45), 15);
    }

    public TestUtil() {
    }

}
