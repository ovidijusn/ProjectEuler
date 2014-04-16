package lt.oworks.projecteuler;

import lt.oworks.projecteuler.problems.Problem;
import lt.oworks.projecteuler.problems.Result;
import lt.oworks.projecteuler.problems.pbs4.Problem46;

/**
 * @author Ovidijus
 *
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Problem p = new Problem46();
        final Result rez = p.doSolve();
        System.out.println(rez);
    }
}
