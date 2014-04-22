package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
        int i = Long.toString(pNum1).length();
        final int[] digits = new int[i];
        long tmp = pNum1;
        i--;
        while (tmp > 0) {
            digits[i--] = (int) (tmp % 10);
            tmp /= 10;
        }
        if (pNum1 == 0) {
            digits[0] = 0;
        }
        return digits;
    }

    public static long[] getPermutations(final long pNum) {
        if (pNum < 10) {
            return new long[]{pNum};
        } else {
            final int[] digitsArray = Digits.toDigits(pNum);
            final List<Integer> digits = new ArrayList<>();
            final Set<Long> permutations = new TreeSet<>();
            for (final int i : digitsArray) {
                digits.add(i);
            }
            getPermutations(digits, permutations, "");
            final long[] rez = new long[permutations.size()];
            int i = 0;
            for (final long p : permutations) {
                rez[i++] = p;
            }
            return rez;
        }

    }

    private static void getPermutations(final List<Integer> digits, final Set<Long> pNumbers, final String pNum) {
        if (digits.size() > 1) {
            digits.stream().forEach((d) -> {
                final List<Integer> temp = new ArrayList<>(digits);
                temp.remove(d);
                getPermutations(temp, pNumbers, pNum + d);
            });
        } else {
            pNumbers.add(Long.parseLong(pNum + digits.get(0)));
        }
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
