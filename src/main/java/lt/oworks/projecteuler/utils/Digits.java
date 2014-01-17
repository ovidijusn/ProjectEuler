package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;

/**
 *
 * @author Ovidijus
 */
public class Digits {

    public static boolean isPandigital(final long pNum, final int pBase) {
        boolean result = true;
        final boolean[] digits = new boolean[pBase];
        int count = 0;
        long tmp = pNum;
        while (tmp > 0) {
            final int digit = (int) (tmp % 10);
            tmp /= 10;
            if (digit == 0 || digit > pBase || digits[digit - 1]) {
                result = false;
                break;
            } else {
                digits[digit - 1] = true;
                count++;
            }
        }
        return result && count == pBase;
    }

    public static long truncateNumber(final long pNum, final boolean pFromRight) {
        long result = 0;
        if (pFromRight) {
            result = pNum / 10;
        } else {
            long base = 1;
            while (pNum % base != pNum) {
                base *= 10;
            }
            result = pNum % (base / 10);
        }
        return result;
    }

    public static int[] toDigits(final long pNum1) {
        final int[] digits = new int[Long.toString(pNum1).length()];
        long tmp = pNum1;
        int i = 0;
        while (tmp > 0) {
            digits[i++] = (int) (tmp % 10);
            tmp /= 10;
        }
        return digits;
    }

    public static long shiftDigits(final long pNum) {
        final long lastDigit = pNum % 10;
        final long left = pNum / 10;
        long base = 1;
        while (left / base > 0) {
            base *= 10;
        }
        return lastDigit * base + left;
    }

    public static boolean isPalindrome(final long pNum, final int pBase) {
        final String number = Long.toString(pNum, pBase);
        final String reversed = new StringBuilder(number).reverse().toString();
        return number.equals(reversed);
    }

    public static BigDecimal digitSum(final BigDecimal pNum) {
        BigDecimal rez = BigDecimal.ZERO;
        final String num = pNum.toString();
        for (int i = 0; i < num.length(); i++) {
            rez = rez.add(new BigDecimal(Character.toString(num.charAt(i))));
        }
        return rez;
    }

    private Digits() {
    }

}
