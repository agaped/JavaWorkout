package hackerrank.warmup;

import java.util.Arrays;

public class SequenceEquotations {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(permutationEquation(5,2,1,3,4)));
    }


    static int[] permutationEquation(int... p) {

        int[] result = new int[p.length];
        int x=1;
        int y=0;


        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[j] == x) {
                   y=j+1;
                }
            }
            for (int j = 0; j < p.length; j++) {
                if (p[j] == y) {
                   result[i]=j+1;
                }
            }
            x++;
        }
        return result;
    }
}
