package hackerrank.warmup;

public class CountingValleys {
    public static void main(String[] args) {

    }

    static int countingValleys(int n, String s) {
        int altitude=0;
        int valleuCount = 0;

        for (Character c : s.toCharArray()) {
            if (c == 'U') {
                altitude++;
                if (altitude == 0) {
                    valleuCount++;
                }
            } else {
                altitude--;
            }
        }
        return valleuCount;
    }
}
