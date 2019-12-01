package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class BonApetit {
    public static void main(String[] args) {

        bonAppetit(Arrays.asList(3,10,2,9),1,7);
    }
    static void bonAppetit(List<Integer> bill, int k, int b) {
        Integer sum = bill.stream()
                .reduce(0, Integer::sum);
        int properValue= (sum - bill.get(k)) / 2;

        if (properValue == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - properValue);
        }


    }
}
