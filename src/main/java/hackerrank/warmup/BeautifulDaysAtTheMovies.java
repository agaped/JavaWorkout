package hackerrank.warmup;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {

        System.out.println(beautifulDays(20,23,6));
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int beautifulDaysCount=0;
        int toReverse;
        int reversed;

        for (int l = i; l <=j ; l++) {
            toReverse=l;
            reversed=0;
            while (toReverse > 0) {
                reversed = (reversed * 10) + toReverse % 10;
                toReverse = toReverse / 10;
            }
            if ((Math.abs(l - reversed) % k) == 0) {
                beautifulDaysCount++;
            }
        }
        return beautifulDaysCount;
    }
}
