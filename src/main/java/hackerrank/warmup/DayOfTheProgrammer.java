package hackerrank.warmup;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1918));

    }

    static String dayOfProgrammer(int year) {

        if (year == 1918) {
            return "26.09.1918";
        }
        if (year <= 1917) {
            if (year % 4 == 0) {
                return "12.09." + year;
            }
            return "13.09." + year;
        }
        if (year % 400 == 0 || (year%4==0 && year%100!=0)) {
            return "12.09." + year;
        }
        return "13.09." + year;

    }
}