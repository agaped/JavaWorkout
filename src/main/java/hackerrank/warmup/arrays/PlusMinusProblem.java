package hackerrank.warmup.arrays;

import java.text.DecimalFormat;

public class PlusMinusProblem {

    static void plusMinus(int[] arr) {
        float neg=0;
        float pos=0;
        float zero=0;

        for (int i: arr) {
            if (i > 0) {
                pos++;
            } else {
                if (i < 0) {
                    neg++;
                } else {
                    zero++;
                }
            }
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);
        df.setMinimumFractionDigits(6);
        System.out.println(df.format(pos/arr.length));
        System.out.println(df.format(neg/arr.length));
        System.out.println(df.format(zero/arr.length));
    }

    public static void main(String[] args) {
        plusMinus(new int[]{0,0,0,-2,4,6,8,9});
    }
}
