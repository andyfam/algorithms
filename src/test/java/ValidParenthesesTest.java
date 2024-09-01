import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    @Test
    void stack(){
        String s = "()";

        assertTrue(new ValidParentheses().stack(s));

        s = "()[]{}";

        assertTrue(new ValidParentheses().stack(s));

        s = "(]";

        assertFalse(new ValidParentheses().stack(s));

        s = "([])";

        assertTrue(new ValidParentheses().stack(s));

        s = "[";

        assertFalse(new ValidParentheses().stack(s));
    }
}
