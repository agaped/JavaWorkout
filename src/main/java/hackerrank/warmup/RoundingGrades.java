package hackerrank.warmup;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RoundingGrades {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new LinkedList<>();
        for (Integer grade: grades) {
            if (grade < 38) {
                result.add(grade);
                continue;
            }
            if (((grade / 5)*5 + 5) - grade < 3) {
                result.add((grade / 5)*5 + 5);
                continue;
            }
            result.add(grade);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(67,58,38,39,41,44)));
    }
}
