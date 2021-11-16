import org.junit.Test;
import sber.Application;

import static org.junit.Assert.assertEquals;

public class SimpleTest {
    @Test
    public void test() {
        int a = 1;
        int b = 1;
        assertEquals(Application.plus(a,b), 2);
    }
}
