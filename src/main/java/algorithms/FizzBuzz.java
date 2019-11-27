package algorithms;

/**
 * Created by agaped on 14.02.2018.
 */
public class FizzBuzz {

    public static String FizzBuzz(int number){
        StringBuilder result=new StringBuilder();
        if(isDivisible(number,3)){
            result.append("Fizz");
        }else{
            result.append("");
        }
        if(isDivisible(number,5)){
            result.append("Buzz");
        }else{
            result.append("");
        }
        return result.toString();

    }
    private static boolean isDivisible(int number, int divisor){
        return number%divisor == 0;
    }

}
