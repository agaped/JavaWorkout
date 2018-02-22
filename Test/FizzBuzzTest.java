import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by agaped on 22.02.2018.
 */
class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void initialiaze(){
        fizzBuzz=new FizzBuzz();
    }

    @Test
    void fizzTest() {
        assertEquals("Fizz",fizzBuzz.FizzBuzz(3));
        assertEquals("Fizz",fizzBuzz.FizzBuzz(13));
        assertEquals("Fizz",fizzBuzz.FizzBuzz(-3));
    }
    @Test
    void buzzTest() {
        assertEquals("Buzz",fizzBuzz.FizzBuzz(5));
        assertEquals("Buzz",fizzBuzz.FizzBuzz(-5));
        assertEquals("Buzz",fizzBuzz.FizzBuzz(34));
    }
    @Test
    void fizzBuzzTest() {
        assertEquals("FizzBuzz",fizzBuzz.FizzBuzz(15));
        assertEquals("FizzBuzz",fizzBuzz.FizzBuzz(-30));
        assertEquals("FizzBuzz",fizzBuzz.FizzBuzz(80));
    }

    @AfterEach
    void tearDown(){
        fizzBuzz=null;
    }
}