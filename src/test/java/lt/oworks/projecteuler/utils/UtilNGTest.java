package lt.oworks.projecteuler.utils;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 *
 * @author Ovidijus
 */
public class UtilNGTest {

    public UtilNGTest() {
    }

    @Test
    public void testGetLetterValue() {
        assertEquals(Util.getLetterValue('S'), 19);
        assertEquals(Util.getLetterValue('K'), 11);
        assertEquals(Util.getLetterValue('Y'), 25);
    }

}
