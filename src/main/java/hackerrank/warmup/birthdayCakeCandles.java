package hackerrank.warmup;

public class birthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        int maxHeight=0;
        int counter=0;
        for (int i :ar) {
            if (i > maxHeight) {
                maxHeight=i;
                counter=1;
                continue;
            }
            if (i == maxHeight) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[]{4,4,3,2,3,1}));
        System.out.println(birthdayCakeCandles(new int[]{4,3,4,3,1,4}));
        System.out.println(birthdayCakeCandles(new int[]{5,4,3,2,3,1}));
        System.out.println(birthdayCakeCandles(new int[]{1,4,5,3,1,4}));
        System.out.println(birthdayCakeCandles(new int[]{1,4,5,3,1,4,9}));
        System.out.println(birthdayCakeCandles(new int[]{9,1,4,5,3,1,4,9,9}));
    }
}
