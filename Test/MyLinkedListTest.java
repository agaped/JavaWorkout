import com.linkedlist.MyLinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by agaped on 10.03.2018.
 */
class MyLinkedListTest {

    MyLinkedList<String> textList;
    MyLinkedList<String> emptyList;
    MyLinkedList<Integer> numberList;

    @BeforeEach
    void setUp() {
        textList=new MyLinkedList<>();
        //Ola Magda Bruno Ala
        textList.add(0, "Ala");
        textList.add(0, "Ola");
        textList.add(1, "Magda");
        textList.add(2, "Bruno");

        emptyList=new MyLinkedList<>();

        numberList=new MyLinkedList<>();
        for (int i = 0; i <51 ; i++) {
            numberList.add(0,i);
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void size() {
        assertEquals(4,textList.size());
        assertEquals(0,emptyList.size());
    }

    @Test
    void get() {
        assertEquals("Ola",textList.get(0));

        textList.remove(0);
        assertEquals("Magda", textList.get(0));

        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class,
                ()->{emptyList.get(1);} );
        exception = assertThrows(ArrayIndexOutOfBoundsException.class,
                ()->{textList.get(-1);} );

    }

    @Test
    void add() {
        emptyList.add(0,"Dagna");
        assertEquals("Dagna",emptyList.get(0));

        textList.add(3,"Dagna");
        assertEquals(5, textList.size());

        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class,
                ()->{emptyList.add(2,"Dagna");} );
    }

    @Test
    void set() {
        assertEquals("Ola", textList.set(0,"Dagna"));

        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class,
                ()->{emptyList.set(0,"Ala");} );
    }

    @Test
    void remove() {
        assertEquals("Ola",textList.remove(0));
        assertEquals(3, textList.size());
        assertEquals("Magda", textList.get(0));

        Throwable exception = assertThrows(ArrayIndexOutOfBoundsException.class,
                ()->{emptyList.remove(0);} );
    }

}