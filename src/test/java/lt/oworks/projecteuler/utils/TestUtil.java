/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.oworks.projecteuler.utils;

import java.math.BigDecimal;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Ovidijus
 */
public class TestUtil {

    @Test
    public void testIsPrime() {

        assertFalse(Util.isPrime(1), "1 nera pirminis");
        assertTrue(Util.isPrime(2), "2 - pirminis");
        assertFalse(Util.isPrime(4), "4 - nëra pirminis");
    }

    public TestUtil() {
    }

}
