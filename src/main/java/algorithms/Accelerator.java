package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by agaped on 16.03.2018.
 */
public class Accelerator {

    public static void main(String[] args){

        int[] tab1={1,1,2,2,3,3,4,4,4,4,4,7,8,9,9,9,9,10,11,11,12,12,13};
        int[] question1={0,1,4,11};
        int[] question2={0,5,6,14,15};
        System.out.println("Result: "+Arrays.toString(moleculeSearch(tab1,question1)));
    }

    public static int[] moleculeSearch(int[] data, int[] questions){
//        int[] data=getData();
//        int[] questions=getQuestions();

        int[] firstOccurence=findFirstOccurence(data, questions);
        int[] lastOccurence=findLastOccurence(data, questions);

        int i=0;
        while(i<firstOccurence.length){
            if(firstOccurence[i]==-1){
                firstOccurence[i]=0;
            }else if(firstOccurence[i]==lastOccurence[i]){
                firstOccurence[i]=1;
            }else if(lastOccurence[i]>firstOccurence[i]){
                firstOccurence[i]=lastOccurence[i]-firstOccurence[i]+1;
            }
            i++;
        }
        return firstOccurence;
    }

    private static int[] getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbe czastek: ");
        int n=Integer.parseInt(sc.next());
        int[] tab=new int[n];
        System.out.println("Podaj posortowane predkosci: ");
        int i=0;
        while(i<n){
            tab[i]=Integer.parseInt(sc.next());
            i++;
        }
        return tab;
    }

    private static int[] getQuestions(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbe zapytan: ");
        int n=Integer.parseInt(sc.next());
        int[] tab=new int[n];
        System.out.println("Podaj predkosci do sprawdzenia: ");
        int i=0;
        while(i<n){
            tab[i]=Integer.parseInt(sc.next());
            i++;
        }
        return tab;
    }

    private static int[] findFirstOccurence(int[] data, int[] questions) {
        int pocz = 0;
        int kon = data.length - 1;
        int[] result=new int[questions.length];
        int i=0;
        while (i<questions.length) {
            while (pocz < kon) {
                int srodek=(pocz+kon)/2;
                if(data[srodek]>=questions[i]){
                    kon=srodek;
                }else{
                    pocz=srodek+1;
                }
            }
            if(data[pocz]==questions[i]){
                result[i]=pocz;
            }else{
                result[i]=-1;
            }
            i++;
            pocz = 0;
            kon = data.length - 1;
        }
        return result;
    }
    private static int[] findLastOccurence(int[] data, int[] questions) {
        int pocz = 0;
        int kon = data.length - 1;
        int[] result=new int[questions.length];
        int i=0;
        while (i<questions.length) {
            while (pocz < kon) {
                int srodek=(pocz+kon+1)/2;
                if(data[srodek]<=questions[i]){
                    pocz=srodek;
                }else{
                    kon=srodek-1;
                }
            }
            if(data[kon]==questions[i]){
                result[i]=kon;
            }else{
                result[i]=-1;
            }
            i++;
            pocz = 0;
            kon = data.length - 1;
        }
        return result;
    }
}