package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author Ovidijus
 */
public class OperationNGTest {

    public OperationNGTest() {
    }

    @Test
    public void testAddAll() {
        long[] arr = {};
        assertEquals(Operation.addAll(), 0);
        long[] arr2 = {1, 2};
        assertEquals(Operation.addAll(arr2), 3);
        assertEquals(Operation.addAll(1, 2, 3, 4, 5), 1 + 2 + 3 + 4 + 5);
    }

    @Test
    public void testFactorial() {
        assertEquals(Operation.factorial(BigDecimal.ONE), BigDecimal.ONE);
        assertEquals(Operation.factorial(new BigDecimal(3)), new BigDecimal(6));
        assertEquals(Operation.factorial(1), 1);
        assertEquals(Operation.factorial(3), 6);
    }

    @Test
    public void testMultiplyAll() {
        assertEquals(Operation.multiplyAll(1, 2, 3), 6);
        assertEquals(Operation.multiplyAll(1, 2, 3, 4), 24);
        assertEquals(Operation.multiplyAll(1, 2, -3), -6);
        assertEquals(Operation.multiplyAll(1, 2, 3, 0), 0);
    }

}
