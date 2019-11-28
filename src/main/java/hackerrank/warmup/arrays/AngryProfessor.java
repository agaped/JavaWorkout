package hackerrank.warmup.arrays;

import java.util.Arrays;

public class AngryProfessor {
    public static void main(String[] args) {
        System.out.println(angryProfessor(7, 26, 94, -95, 34, 67, -97, 17, 52, 1, 86));

    }
    static String angryProfessor(int k, int... a) {
        long studentsOnTime = Arrays.stream(a)
                .filter(i -> i >= 0)
                .count();

        return studentsOnTime >= k ? "NO" : "YES";
    }
}
