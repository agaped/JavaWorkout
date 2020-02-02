package hackerrank.warmup;

import java.util.Arrays;

public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(simpleArraySum(new int[]{1,2,3,4,5,6}));
    }
}
