package lt.oworks.projecteuler.problems.pbs1;

import lt.oworks.projecteuler.problems.Problem;

/**
 * Counting Sundays
 *
 * @see http://projecteuler.net/problem=19
 * @author Ovidijus
 */
public class Problem19 extends Problem {

    @Override
    public String solve() {
        return Integer.toString(countWeekDayInRange(7, 1, 1901, 1, 1, 2000, 12, 31));
    }

    private int countWeekDayInRange(final int pW, final int pD, final int pY1, final int pM1, final int pD1, final int pY2, final int pM2, final int pD2) {
        boolean startCount = false;
        int count = 0;

        int y = 1900;
        int m = 1;
        int d = 1;
        int w = 1;
        int dayCount = monthLength(y, 1);

        while (isBigger(y, m, d, pY2, pM2, pD2)) {
            if (dayCount < d) {
                if (m == 12) {
                    y++;
                    m = 1;
                } else {
                    m++;
                }
                dayCount = monthLength(y, m);
                d = 1;
            }
            if (!startCount) {
                startCount = (m == pM1) && (y == pY1) && (d == pD1);
            }
            if (startCount && pW == w && pD == d) {
                count++;
            }
            d++;
            w = w == 7 ? 1 : (w + 1);
        }

        return count;
    }

    private int monthLength(final int pY, final int pM) {
        int result = 30;
        switch (pM) {
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 2:
                if (pY % 100 == 0) {
                    result = pY % 400 == 0 ? 29 : 28;
                } else {
                    result = pY % 4 == 0 ? 29 : 28;
                }
                break;
        }
        return result;
    }

    private boolean isBigger(final int pY1, final int pM1, final int pD1, final int pY2, final int pM2, final int pD2) {
        boolean result = true;

        if (pY1 > pY2) {
            result = false;
        } else if (pY1 == pY2 && pM1 > pM2) {
            result = false;
        } else if (pY1 == pY2 && pM1 == pM2 && pD1 > pD2) {
            result = false;
        }

        return result;
    }
}
