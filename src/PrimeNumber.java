import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by agaped on 22.02.2018.
 */
public class PrimeNumber {

    //complexity O(n)
    public static boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //complexity O(sqrt(n))
    public static boolean isPrimeUsingSquare(int number) {
        if (number < 2) return false;

        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> sieveOfEratosthenes(int n){
        if(n<2){
            throw new IllegalArgumentException("Number should be greater than 1");
        }
        boolean[] tab=new boolean[n+1];
        Arrays.fill(tab, true);
        for (int i = 2; i*i <=n ; i++) {
            if(tab[i]){

                for (int j = i*2; j <=n ; j+=i) {
                    tab[j]=false;
                }
            }
        }
        List<Integer> prime=new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            if(tab[i]){
                prime.add(i);
            }
        }

        int[] p=new int[prime.size()];

        return prime;
    }
}
