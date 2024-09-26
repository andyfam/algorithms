import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IsSubsequenceTest {
    @Test
    void isSubsequence(){
        assertTrue(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
        assertFalse(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
    }
}
