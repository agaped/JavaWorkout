package hackerrank.warmup;

import java.util.Arrays;

public class HurdleRace {
    public static void main(String[] args) {
        System.out.println(hurdleRace(4, 5,3,2,5,5,6));
    }

    static int hurdleRace(int k, int... height) {

        int max = Arrays.stream(height)
                .max()
                .getAsInt();

        return max-k>0? max-k : 0;

    }
}
