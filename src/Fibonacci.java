/**
 * Created by agaped on 14.02.2018.
 */
public class Fibonacci {

    public static long fibonacci(int number){
        long a=0L;
        long b=1L;
        long c;
        if(number<0){
            throw new IllegalArgumentException("Number should be >= 0");
        }
        if(number==0){
            return a;
        }
        for (int i = 2; i <=number ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }

}
