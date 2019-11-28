package hackerrank.warmup.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 6, 5, 3, 3, 1,7,7,9,9,9,7);
        System.out.println(pickingNumbers(list));

    }
    public static int pickingNumbers(List<Integer> a) {
        int[] frequency = new int[101];
        int diff=0;
        int maxDiff=0;

        for (Integer i: a) {
            frequency[i]++;
        }

        for (int i = 1; i <frequency.length ; i++) {
            diff = frequency[i - 1] + frequency[i];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }

}
