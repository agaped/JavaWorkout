import java.util.ArrayList;
import java.util.List;

/**
 * Created by agaped on 16.03.2018.
 */

//Mając dane liczby naturalne p i q, znajdź taką liczbę naturalną x,
//        dla której x^3 + px = q lub ustal, że taka liczba nie istnieje.

public class TartagliiExercise {


    public static int findX(int p, int q) {

        if ((p < 1) || (q < 1)) {
            throw new IllegalArgumentException();
        }

        int[] tab = new int[q];
        for (int i = 0; i < q; i++) {
            tab[i] = i;
        }
        int pocz = 0;
        int kon = q - 1;
        int srodek = 0;
        int result = 0;
        while (pocz < kon) {

            srodek = (pocz + kon) / 2;
            result = (int) Math.pow(tab[srodek], 3) + p * tab[srodek];
            if (result == q) {
                return tab[srodek];
            } else if (result < q) {
                pocz = srodek + 1;
            } else {
                kon = srodek - 1;
            }
        }
        return -1;
    }
}

