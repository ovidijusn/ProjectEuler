package lt.oworks.projecteuler.problems.pbs1;

import lt.oworks.projecteuler.problems.Problem;
import java.util.HashMap;
import java.util.Map;

/**
 * Number letter counts
 *
 * @see http://projecteuler.net/problem=17
 * @author Ovidijus
 */
public class Problem17 extends Problem {

    private static final int LIMIT = 1000;
    private static final String[] DIGITS = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final Map<Integer, String> TENS = new HashMap<>();

    static {
        TENS.put(10, "ten");
        TENS.put(11, "eleven");
        TENS.put(12, "twelve");
        TENS.put(13, "thirteen");
        TENS.put(14, "fourteen");
        TENS.put(15, "fifteen");
        TENS.put(16, "sixteen");
        TENS.put(17, "seventeen");
        TENS.put(18, "eighteen");
        TENS.put(19, "nineteen");
        TENS.put(20, "twenty");
        TENS.put(30, "thirty");
        TENS.put(40, "forty");
        TENS.put(50, "fifty");
        TENS.put(60, "sixty");
        TENS.put(70, "seventy");
        TENS.put(80, "eighty");
        TENS.put(90, "ninety");
    }

    @Override
    public String solve() {
        int sum = 0;
        for (int i = 1; i <= LIMIT; i++) {
            final String words = numberToWords(i);
            sum += (words.replaceAll(" ", "").replaceAll("-", "").length());
        }
        return Integer.toString(sum);
    }

    private String numberToWords(final int pNum) {
        final StringBuilder rez = new StringBuilder();
        int number = pNum;

        int tmp = number / 1000;
        if (tmp > 0) {
            return "one thousand";
        }
        number %= 1000;

        tmp = number / 100;
        boolean needAND = false;
        if (tmp > 0) {
            rez.append(DIGITS[tmp]).append(" hundred");
            needAND = number % 100 > 0;
        }
        number %= 100;

        tmp = number / 10;
        if (TENS.containsKey(number)) {
            rez.append(needAND ? " and " : "").append(TENS.get(number));
        } else if (tmp == 0) {
            rez.append(needAND ? " and " : "").append(DIGITS[number]);
        } else {
            rez.append(needAND ? " and " : "").append(TENS.get(tmp * 10));
            if (number % 10 != 0) {
                rez.append("-").append(DIGITS[number % 10]);
            }
        }

        return rez.toString();
    }

}
