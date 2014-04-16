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
}
