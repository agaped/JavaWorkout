package hackerrank.warmup;

import java.util.Arrays;

public class MinMax {

    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);

        long sum=0;          // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        for (int i:arr) {
            sum+=i;
        }

        System.out.println(sum-arr[arr.length-1]+" "+(sum-arr[0]));
    }

    public static void main(String[] args) {
        miniMaxSum(new int[]{1,3,5,7,9});
    }
}
