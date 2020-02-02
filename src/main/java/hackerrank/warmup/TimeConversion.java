package hackerrank.warmup;

public class TimeConversion {

    static String timeConversion(String s) {
        if (s.endsWith("PM")) {
            if (s.substring(0, 2).equals("12")) {
                return s.substring(0, s.length() - 2);
            }
            return Integer.valueOf(s.substring(0, 2)) + 12 + s.substring(2, s.length() - 2);
        }
        if (s.substring(0, 2).equals("12")) {
            return "00"+s.substring(2, s.length() - 2);
        }
        return s.substring(0, s.length() - 2);

    }

    public static void main(String[] args) {
        System.out.printf(timeConversion("10:06:11PM"));
    }
}
