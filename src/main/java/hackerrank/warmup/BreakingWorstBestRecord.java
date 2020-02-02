package hackerrank.warmup;

import java.util.Arrays;

public class BreakingWorstBestRecord {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(breakingRecords(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)));
    }

    static int[] breakingRecords(int... scores) {
        int[] result = new int[2];
        int best=scores[0];
        int worst=scores[0];

        for (int i = 1; i <scores.length ; i++) {
            if (scores[i] > best) {
                best = scores[i];
                result[0]++;
            }
            if (scores[i] < worst) {
                worst = scores[i];
                result[1]++;
            }
        }
        return result;
    }

}
