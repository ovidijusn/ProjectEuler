package lt.oworks.projecteuler;

import java.util.HashMap;
import java.util.Map;
import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.problems.Result;
import lt.oworks.projecteuler.problems.pbs0.*;
import lt.oworks.projecteuler.problems.pbs1.*;
import lt.oworks.projecteuler.problems.pbs2.*;
import lt.oworks.projecteuler.problems.pbs3.*;
import lt.oworks.projecteuler.problems.pbs4.*;

/**
 *
 * @author Ovidijus
 */
public class Problems {

    private final Map<Integer, Problem> problems = new HashMap<>();
    private int lastAddKey;

    public void solve(final int pProblemId) {
        final Problem p = problems.get(pProblemId);
        if (p == null) {
            System.err.println("Problem not found.");
        } else {
            final Result r = p.doSolve();
            System.out.println(r);
        }
    }

    public void solveLast() {
        solve(lastAddKey);
    }

    public void checkAnswerOf(final int pProblemId) {
        final Problem p = problems.get(pProblemId);
        if (p == null) {
            System.err.println("Problem not found.");
        } else {
            p.checkAnswer();
        }
    }

    public void checkAllAnswers() {
        System.out.println("Check " + problems.size() + " problems:");
        boolean allGood = true;
        for (final Problem p : problems.values()) {
            allGood = allGood && p.checkAnswer();
        }
        System.out.println(allGood ? "All problems solved" : "Some problems are not solved");
    }

    private void addProblem(final int pId, final Problem pProblem) {
        problems.put(pId, pProblem);
        lastAddKey = pId;
    }

    {
        addProblem(1, new Problem1());
        addProblem(2, new Problem2());
        addProblem(3, new Problem3());
        addProblem(4, new Problem4());
        addProblem(5, new Problem5());
        addProblem(6, new Problem6());
        addProblem(7, new Problem7());
        addProblem(8, new Problem8());
        addProblem(9, new Problem9());
        addProblem(10, new Problem10());

        addProblem(11, new Problem11());
        addProblem(12, new Problem12());
        addProblem(13, new Problem13());
        addProblem(14, new Problem14());
        addProblem(15, new Problem15());
        addProblem(16, new Problem16());
        addProblem(17, new Problem17());
        addProblem(18, new Problem18());
        addProblem(19, new Problem19());
        addProblem(20, new Problem20());

        addProblem(21, new Problem21());
        addProblem(22, new Problem22());
        addProblem(23, new Problem23());
        addProblem(24, new Problem24());
        addProblem(25, new Problem25());
        addProblem(26, new Problem26());
        addProblem(27, new Problem27());
        addProblem(28, new Problem28());
        addProblem(29, new Problem29());
        addProblem(30, new Problem30());

        addProblem(31, new Problem31());
        addProblem(32, new Problem32());
        addProblem(33, new Problem33());
        addProblem(34, new Problem34());
        addProblem(35, new Problem35());
        addProblem(36, new Problem36());
        addProblem(37, new Problem37());
        addProblem(38, new Problem38());
        addProblem(39, new Problem39());
        addProblem(40, new Problem40());

        addProblem(41, new Problem41());
    }
}
