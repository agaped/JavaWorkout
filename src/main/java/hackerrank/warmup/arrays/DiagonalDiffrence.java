package hackerrank.warmup.arrays;

import java.util.Arrays;
import java.util.List;

public class DiagonalDiffrence {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int left=0;
        int right=0;
        int j=0;
        int k=arr.size()-1;

        for (List<Integer> list:arr){
            left +=list.get(j);
            right += list.get(k);
            j++;
            k--;
        }

        return Math.abs(left - right);
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        System.out.println(diagonalDifference(Arrays.asList(list1, list2, list3)));
    }

//
//    static int diagonalDifference(int[][] arr) {
//        int x = 0;
//        int y = arr[0].Length - 1;
//        int sum = 0;
//        for(int index=0;  index<arr.Length;  index++){
//            //sum -= arr[x][x] - arr[x++][y--]; can also be simplified as below:
//            sum = sum - ( arr[x][x] - arr[x++][y--] );
//        }
//        return Math.Abs(sum);
//    }
}
