public class FibonacciRecursionMemoization {

    int[] tab = new int[47];
    long[] tabL = new long[93];

    int fib(int n) {

        tab[1] = 1;
        if (n <= 1) return n;
        if (tab[n] != 0) return tab[n];
        tab[n] = fib(n - 1) + fib(n - 2);
        return tab[n];
    }

    long fibL(int n) {

        tabL[1] = 1;
        if (n <= 1) return n;
        if (tabL[n] != 0) return tabL[n];
        tabL[n] = fibL(n - 1) + fibL(n - 2);
        return tabL[n];
    }

    public static void main(String[] args) {

        FibonacciRecursionMemoization f = new FibonacciRecursionMemoization();
        System.out.println(f.fib(46));
        for (int i = 0; i < f.tab.length; i++) {
            System.out.println(i + " : " + f.tab[i]);
        }

        System.out.println(f.fibL(92));
        for (int i = 0; i < f.tabL.length; i++) {
            System.out.println(i + " : " + f.tabL[i]);
        }
    }
}