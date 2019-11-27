package algorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by agaped on 12.03.2018.
 */
class ValidParenthesesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isValidStandardCase() {
        assertEquals(true, ValidParentheses.isValid("()sd(s)[d]"));
        assertEquals(true, ValidParentheses.isValid("[]ab(1{3})"));
    }
    @Test
    void isValidNullCase() {
        assertEquals(false, ValidParentheses.isValid(null));
    }

    @Test
    void isValidEmptyCase() {
        assertEquals(false, ValidParentheses.isValid(""));
    }

    @Test
    void isNotValid() {
        assertNotEquals(true, ValidParentheses.isValid("{fgh}jk]"));
        assertNotEquals(true, ValidParentheses.isValid("[{]}"));
    }
}