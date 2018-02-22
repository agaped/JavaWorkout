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

}
