package algorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by agaped on 22.02.2018.
 */
class PrimeNumberTest {

    private PrimeNumber p;

    @BeforeEach
    void setUp() {
        p = new PrimeNumber();
    }

    @Test
    void isPrimeCaseOne() {
        assertTrue(p.isPrime(3) == true);
        assertTrue(p.isPrime(5) == true);
        assertTrue(p.isPrime(7) == true);
        assertTrue(p.isPrime(11) == true);
        assertTrue(p.isPrime(13) == true);
        assertTrue(p.isPrime(17) == true);
        assertTrue(p.isPrime(23) == true);
    }

    @Test
    void isPrimeCaseTwo() {
        assertTrue(p.isPrime(1) == false);
        assertTrue(p.isPrime(4) == false);
        assertTrue(p.isPrime(9) == false);
        assertTrue(p.isPrime(14) == false);
        assertTrue(p.isPrime(18) == false);
        assertTrue(p.isPrime(21) == false);
    }

    @Test
    void isPrimeCaseFour() {
        assertTrue(p.isPrimeUsingSquare(3) == true);
        assertTrue(p.isPrimeUsingSquare(5) == true);
        assertTrue(p.isPrimeUsingSquare(7) == true);
        assertTrue(p.isPrimeUsingSquare(11) == true);
        assertTrue(p.isPrimeUsingSquare(13) == true);
        assertTrue(p.isPrimeUsingSquare(17) == true);
        assertTrue(p.isPrimeUsingSquare(23) == true);
    }

    @Test
    void isPrimeCaseFive() {
        assertTrue(p.isPrimeUsingSquare(1) == false);
        assertTrue(p.isPrimeUsingSquare(4) == false);
        assertTrue(p.isPrimeUsingSquare(9) == false);
        assertTrue(p.isPrimeUsingSquare(14) == false);
        assertTrue(p.isPrimeUsingSquare(18) == false);
        assertTrue(p.isPrimeUsingSquare(21) == false);
    }

    @Test
    void checkExceptionThrownSitoOfErastotenes() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            PrimeNumber.sieveOfEratosthenes(1);});
    }

    @Test
    void checkIfCorrectListIsReturned(){
        List<Integer> test=new ArrayList<Integer>();
        test.add(2);

        //for (int i = 0; i < test.size(); i++) {
            assertEquals(test.get(0), PrimeNumber.sieveOfEratosthenes(2).get(0));
        //}
    }

    @AfterEach
    void tearDown(){
        p=null;
    }

}