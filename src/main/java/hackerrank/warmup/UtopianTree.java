package hackerrank.warmup;

public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(10));
        System.out.println(utopianTreeNext(10));

    }
    static int utopianTree(int n) {

        int height=1;
        for (int i = 1; i <=n ; i++) {
            height*=2;
            i++;
            if (i <= n) {
                height += 1;
            }
        }
        return height;

    }

    static int utopianTreeNext(int n) {

        int height=1;
        for (int i = 1; i <=n ; i++) {
            if (i % 2 == 0) {
                height++;
            } else {
                height *= 2;
            }
        }
        return height;

    }
}
