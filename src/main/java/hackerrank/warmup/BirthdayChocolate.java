package hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 1, 1, 1, 1, 1);
        List<Integer> b = Arrays.asList(1, 2, 1, 3, 2);
        List<Integer> c = Arrays.asList(4);

        System.out.println(birthday(a,3,2));
        System.out.println(birthday(b, 3,2));
        System.out.println(birthday(c,4,1));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int days=0;
        int counter = 0;
        int start=0;

        for (int i = 0; i < s.size(); i++) {
            start=i;
            days=0;
            for (int j = 0; j <m ; j++) {
                days += s.get(start);
                start++;
                if (start >= s.size()) {
                    break;
                }
            }
            if (days == d) {
                counter++;
            }
        }
        return counter;
    }
}
