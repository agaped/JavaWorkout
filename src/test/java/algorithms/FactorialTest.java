package algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by agaped on 22.02.2018.
 */
class FactorialTest {

    private Factorial f;

    @BeforeEach
    void setUp(){
        f=new Factorial();
    }

    @Test
    void factorialCaseOne() {
        assertEquals(120, f.factorial(5));
    }
    @Test
    void factorialCaseTwo() {
        assertEquals(5040, f.factorial(7));
    }
    @Test
    void factorialCaseThree() {
        assertEquals(39916800, f.factorial(11));
    }
    @Test
    void factorialCaseFour() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Number should be >= 0");
        });
        assertEquals("Number should be >= 0", exception.getMessage());
    }
}