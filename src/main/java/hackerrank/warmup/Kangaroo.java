package hackerrank.warmup;

public class Kangaroo {
    public static void main(String[] args) {

        System.out.println(kangarooBrutForce(0,3,4,2));
    }

    static String kangarooBrutForce(int x1, int v1, int x2, int v2) {

        for (int i = 0; i <=100_000_000; i++) {
            x1+=v1;
            x2+=v2;
            if (x1 == x2) {
                return "YES";
            }
        }
        return "NO";
    }

    /*x1 = v1 * j
    * x2 = v2 * j
    *
    * x1 + v1*j = x2 +v2*j
    * v1*j - v2*j = x2 - x1
    * j = (x2 - x1) / (v1 - v2)
    *
    * */

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2) {
            if ((x2 - x1) % (v1 - v2) == 0) {
                return "YES";
            }
            return "NO";
        }
        return "NO";
    }
}
