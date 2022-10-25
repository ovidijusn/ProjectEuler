package utils;

import lt.oworks.projecteuler.utils.Digits;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Ovidijus
 */
public class DigitsTest {

    public DigitsTest() {
    }

    @Test
    public void testToDigits() {
        Assert.assertArrayEquals("0", new int[]{0}, Digits.toDigits(0));
        Assert.assertArrayEquals("1", new int[]{1}, Digits.toDigits(1));
        Assert.assertArrayEquals("1,2", new int[]{1, 2}, Digits.toDigits(12));
        Assert.assertArrayEquals("3,2,1", new int[]{3, 2, 1}, Digits.toDigits(321));
    }

    @Test
    public void testGetPermutations() {
        Assert.assertArrayEquals("0", new long[]{0}, Digits.getPermutations(0));
        Assert.assertArrayEquals("5", new long[]{5}, Digits.getPermutations(5));

        Assert.assertArrayEquals("12, 21", new long[]{12, 21}, Digits.getPermutations(12));

        Assert.assertArrayEquals("123, 132, 213, 231, 312, 321", new long[]{123, 132, 213, 231, 312, 321}, Digits.getPermutations(123));
    }

}
