package hackerrank.warmup;

import java.util.Arrays;
import java.util.OptionalInt;

public class ElectronicShop {
    public static void main(String[] args) {

        int[] k = {3,1};
        int[] d = {5,2,8};
        System.out.println(getMoneySpent(d,k,10));

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int[] result = new int[keyboards.length * drives.length];
        int i=0;

        for (int k : keyboards) {
            for (int d : drives) {
                result[i] = k + d;
                i++;
            }
        }
        System.out.println(Arrays.toString(result));
        OptionalInt max = Arrays.stream(result)
                .filter(r -> r <= b)
                .max();

        return max.orElse(-1);
    }
}
