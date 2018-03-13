import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by agaped on 22.02.2018.
 */
class FibonacciTest {

    private Fibonacci f;

    @BeforeEach
    void setUp(){
        f=new Fibonacci();
    }
    @Test
    void fibonacciCaseOne() {
        assertEquals(0, f.fibonacci(0));
    }
    @Test
    void fibonacciCaseTwo() {
        assertEquals(21, f.fibonacci(8));
    }
    @Test
    void fibonacciCaseThree() {
        assertEquals(988, f.fibonacci(16));
    }

    @Test
    void exceptionHandling() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Number should be >= 0");
        });
        assertEquals("Number should be >= 0", exception.getMessage());
    }

    @AfterEach
    void tearDown(){
        f=null;
    }
}