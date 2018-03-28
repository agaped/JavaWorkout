import java.util.ArrayList;
import java.util.List;

/**
 * Created by agaped on 21.03.2018.
 */
public class MatchLettersFromGivenWord {


//        String search="loop";
//        String[] words={"loop","pool","lopo","book","kobo","lpoo"};

    public static List<String> matchLetters(String search, String[] words) {
        if(words.length==0 || search==null){
            throw new IllegalArgumentException();
        }
        if(words==null){
            throw new NullPointerException();
        }

        boolean flag = false;
        List<String> result=new ArrayList<>();
        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                if (search.contains(Character.toString(s.charAt(i)))) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                result.add(s);
        }
        return result;
    }
}