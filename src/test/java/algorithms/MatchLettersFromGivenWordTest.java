package algorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by agaped on 21.03.2018.
 */
class MatchLettersFromGivenWordTest {

    String[] words={"loop","pool","lopo","book","kobo"};
    String[] words1;
    String search;
    String search1;
    String search2;
    @BeforeEach
    void setUp() {
        search="loop";
        search1="class";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void CasePositive() {
        List<String> result=new ArrayList<>();
        result.add("loop");
        result.add("pool");
        result.add("lopo");
        assertEquals(result,MatchLettersFromGivenWord.matchLetters(search,words));
    }
    @Test
    void CaseNegative() {
        List<String> result=new ArrayList<>();
        assertEquals(result,MatchLettersFromGivenWord.matchLetters(search1,words));
    }

    @Test
    void CaseNull() {
        Throwable exception = assertThrows(NullPointerException.class,
                ()->{
                   MatchLettersFromGivenWord.matchLetters(search, words1);} );
    }
    @Test
    void CaseWrongArgument() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->{
                    MatchLettersFromGivenWord.matchLetters(search2, words);} );
    }
}