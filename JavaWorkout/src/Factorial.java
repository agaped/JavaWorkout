/**
 * Created by agaped on 14.02.2018.
 */
public class Factorial {

    public static long factorial(int number){
        if(number<0){
            throw new IllegalArgumentException("Number should be >= 0");
        }
        long result =1L;
        for (int i = 1; i <=number ; i++) {
            result*=i;
        }
        return result;
    }

}
