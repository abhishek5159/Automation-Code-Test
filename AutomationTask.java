import org.junit.Test;
import static org.junit.Assert.*;

public class DoMathsTest {

    @Test
    public void testReturnsExpectedResult() {
        String result = doMaths("5", "7");
        assertEquals("12", result);
    }

    @Test(expected = TypeError.class)
    public void testThrowsTypeErrorForNonStringArguments() {
        doMaths(5, 7);
    }

    @Test(expected = ValueError.class)
    public void testThrowsValueErrorForNonNumericStrings() {
        doMaths("five", "seven");
    }
}
