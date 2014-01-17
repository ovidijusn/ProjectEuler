package lt.oworks.projecteuler.utils;

/**
 *
 * @author Ovidijus
 */
public class Util {

    private static final char[] ABC = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static int getLetterValue(final char pChar) {
        final char up = Character.toUpperCase(pChar);
        int result = 0;
        if (Character.isLetter(up)) {
            for (int i = 0; i < ABC.length; i++) {
                if (ABC[i] == up) {
                    result = i + 1;
                    break;
                }
            }
        }
        return result;
    }

    private Util() {
    }

}
