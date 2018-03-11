package exercises;

/**
 * Created by Agunia on 10.03.2018.
 */
public interface OnFoot {

    default String walk(){
        return "10 km walk!";
    }

    default String stop(int i){
        return "OnFoot: Stop";
    }
}
