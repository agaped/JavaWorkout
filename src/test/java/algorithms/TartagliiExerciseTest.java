package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by agaped on 16.03.2018.
 */
class TartagliiExerciseTest {

    @Test
    void TestCase1() {
        assertEquals(2, TartagliiExercise.findX(3,14));
    }

    @Test
    void TestCase2() {
        assertEquals(-1, TartagliiExercise.findX(14,257));
    }

    @Test
    void TestCase3() {
        assertNotEquals(4, TartagliiExercise.findX(3,14));
    }

    @Test
    void TestException() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->{
                    TartagliiExercise.findX(0,4);} );
    }
}