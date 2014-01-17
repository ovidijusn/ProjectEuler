package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author Ovidijus
 */
public class DigitsNGTest {

    public DigitsNGTest() {
    }

    @Test
    public void testIsPandigital() {
        assertTrue(Digits.isPandigital(1, 1), "1");
        assertTrue(Digits.isPandigital(12, 2), "12");
        assertTrue(Digits.isPandigital(123, 3), "123");
        assertTrue(Digits.isPandigital(1234, 4), "1234");
        assertTrue(Digits.isPandigital(12345, 5), "12345");
        assertFalse(Digits.isPandigital(2, 1), "2");
        assertFalse(Digits.isPandigital(22, 2), "22");
        assertFalse(Digits.isPandigital(124, 3), "124");
        assertFalse(Digits.isPandigital(1111, 4), "1111");
        assertFalse(Digits.isPandigital(12355, 5), "12355");
    }

    @Test
    public void testShiftDigits() {
        assertEquals(Digits.shiftDigits(123), 312);
        assertEquals(Digits.shiftDigits(1), 1);
    }

    @Test
    public void testToDigits() {
        assertEquals(Digits.toDigits(1), new int[]{1});
        assertEquals(Digits.toDigits(12), new int[]{2, 1});
        assertEquals(Digits.toDigits(120), new int[]{0, 2, 1});
    }

    @Test
    public void testTruncateNumber() {
        assertEquals(Digits.truncateNumber(123, true), 12);
        assertEquals(Digits.truncateNumber(123, false), 23);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(Digits.isPalindrome(585, 10));
        assertTrue(Digits.isPalindrome(585, 2));
        assertFalse(Digits.isPalindrome(586, 10));
    }

    @Test
    public void testDigitSum() {
        assertEquals(Digits.digitSum(new BigDecimal(123)), new BigDecimal(6));
        assertEquals(Digits.digitSum(new BigDecimal(321)), new BigDecimal(6));
        assertEquals(Digits.digitSum(new BigDecimal(105)), new BigDecimal(6));
    }

}
