package hackerrank.warmup.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result=new ArrayList<>();
        int resultA=0;
        int resultB=0;
        for(int i=0; i<a.size();i++){
            if(a.get(i)>b.get(i)) {
                resultA++;
            }else{
                if(a.get(i)<b.get(i)){
                    resultB++;
                }
            }
        }

        return Arrays.asList(resultA,resultB);
    }

    public static void main(String[] args) {

        System.out.println(compareTriplets(Arrays.asList(1,4,6), Arrays.asList(1,1,1)));
    }
}
