package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {

        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));

    }

    static int migratoryBirds(List<Integer> arr) {

        int[] result = new int[6];
//        int max = 0;
        int maxIndex = 1;

        for (int i : arr) {
            result[i]++;
        }
//        for (int i : result) {
//            if (i > max) {
//                max = i;
//            }
//        }
//        List<Integer> ints = Arrays.stream(result).boxed().collect(Collectors.toList());

//        return ints.indexOf(max);

        for (int i = 1; i < result.length; i++) {
            if (result[maxIndex] < result[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

