import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by agaped on 16.03.2018.
 */
class AcceleratorTest {

    int[] tab1={1,1,2,2,3,3,4,4,4,4,4,7,8,9,9,9,9,10,11,11,12,12,13};
    int[] question1={0,1,4,11};
    int[] question2={0,5,6,14,15};

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCase1() {
        int[] result={0,2,5,2};
        assertArrayEquals(result,Accelerator.moleculeSearch(tab1,question1));
    }
    @Test
    void testCase2() {
        int[] result={0,0,0,0,0};
        assertArrayEquals(result,Accelerator.moleculeSearch(tab1,question2));
    }

}