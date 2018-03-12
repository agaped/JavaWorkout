package mergesort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by agaped on 10.03.2018.
 */
public class MergeSort {
    public static void main(String[] args){
        Random r=new Random();
        int[] array=new int[101];
        for (int i = 0; i <array.length ; i++) {
            array[i]=r.nextInt(100);
        }
        System.out.println("Przed posortowaniem: "+ Arrays.toString(array));

        long startTime=System.nanoTime();
        sort(array);
        long endTime=System.nanoTime();

        System.out.println("Po sortowaniu :"+Arrays.toString(sort(array)));
        System.out.println("Czas w s :"+(endTime-startTime)/1000000000.0);

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < array.length; i++) {
//            if (i > 0) {
//                sb.append(", ");
//            }
//            sb.append(array[i]);
//        }
//        System.out.println(sb.toString());

    }

    public static int[] sort(int[] tab){

        if(tab.length==1){
            return tab;
        }else{
            int[] firstHalf=new int[tab.length/2];
            int[] secondHalf=new int[tab.length-firstHalf.length];

            for (int i=0; i<firstHalf.length; i++){
                firstHalf[i]=tab[i];
            }
            for (int i=0; i<secondHalf.length; i++){
                secondHalf[i]=tab[firstHalf.length+i];
            }

            return merge(sort(firstHalf),sort(secondHalf));

        }
    }

    public static int[] merge(int[] left, int[] right){
            int[] result=new int[left.length+right.length];
            int i=0, j=0, k=0;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    result[k] = left[i]; //result[k++] = left[i++];
                    i++;
                    k++;
                } else {
                    result[k] = right[j]; //result[k++] = right[j++];
                    k++;
                    j++;
                }
            }
            while (i < left.length) {
                result[k] = left[i];
                k++;
                i++;
            }
            while (j < right.length) {
                result[k] = right[j];
                k++;
                j++;
            }
            return result;
    }

}
