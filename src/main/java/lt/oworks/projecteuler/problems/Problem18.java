package lt.oworks.projecteuler.problems;

import java.util.ArrayList;
import java.util.List;
import lt.oworks.projecteuler.Utils;

/**
 * Maximum path sum I
 *
 * @see http://projecteuler.net/problem=18
 * @author Ovidijus
 */
public class Problem18 extends Problem {

    private static final int[][] INPUT = {
        {75},
        {95, 64},
        {17, 47, 82},
        {18, 35, 87, 10},
        {20, 4, 82, 47, 65},
        {19, 1, 23, 75, 3, 34},
        {88, 2, 77, 73, 7, 63, 67},
        {99, 65, 4, 28, 6, 16, 70, 92},
        {41, 41, 26, 56, 83, 40, 80, 70, 33},
        {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
        {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
        {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
        {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
        {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
        {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}
    };

    private final List<Integer> sums = new ArrayList<>();

    @Override
    public String solve() {
        int sum = 0;
        doSearch(INPUT, 0, 0, 0);
        for (final int s : sums) {
            sum = Utils.max(sum, s);
        }
        return Integer.toString(sum);
    }

    private void doSearch(final int[][] pMatrix, final int pDeep, final int pClmn, final int pSum) {
        if (pDeep >= INPUT.length) {
            sums.add(pSum);
        } else if (pMatrix[pDeep].length == 1) {
            doSearch(pMatrix, pDeep + 1, 0, pMatrix[pDeep][0]);
        } else {
            doSearch(pMatrix, pDeep + 1, pClmn, pSum + pMatrix[pDeep][pClmn]);
            doSearch(pMatrix, pDeep + 1, pClmn + 1, pSum + pMatrix[pDeep][pClmn + 1]);
        }

    }

}
