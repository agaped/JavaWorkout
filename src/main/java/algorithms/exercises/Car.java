package algorithms.exercises;

/**
 * Created by Agunia on 10.03.2018.
 */
public interface Car {

    default String drive(){
        return "100 km ride!";
    }
    default String stop(){
        return "Car: Stop here!";
    }
}
