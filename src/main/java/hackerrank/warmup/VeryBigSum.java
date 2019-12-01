package hackerrank.warmup;

import java.util.Arrays;

public class VeryBigSum {

    public static void main(String[] args) {


        long[] arr={1_000_000_001, 1_000_000_002, 1_000_000_003, 1_000_000_004, 1_000_000_005};
        System.out.println(aVeryBigSum(arr));
    }

    static long aVeryBigSum(long[] ar) {

        return Arrays.stream(ar)
                .sum();
    }

}
