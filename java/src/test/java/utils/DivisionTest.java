package utils;

import lt.oworks.projecteuler.utils.Division;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Ovidijus
 */
public class DivisionTest {

    public DivisionTest() {
    }

    @Test
    public void testIsPrime() {
        Assert.assertTrue(Division.isPrime(3));
        Assert.assertTrue(Division.isPrime(5));
        Assert.assertTrue(Division.isPrime(19));

        Assert.assertFalse(Division.isPrime(1));
        Assert.assertFalse(Division.isPrime(4));
        Assert.assertFalse(Division.isPrime(100));
    }

    @Test
    public void testFindPrimeDivisors() {

        Assert.assertArrayEquals(Division.findPrimeDivisors(2), new long[]{2});
        Assert.assertArrayEquals(Division.findPrimeDivisors(5), new long[]{5});
        Assert.assertArrayEquals(Division.findPrimeDivisors(6), new long[]{2, 3});
        Assert.assertArrayEquals(Division.findPrimeDivisors(24), new long[]{2, 3});
        Assert.assertArrayEquals(Division.findPrimeDivisors(60), new long[]{2, 3, 5});
    }
}
