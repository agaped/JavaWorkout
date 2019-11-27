package algorithms.exercises;

/**
 * Created by Agunia on 08.03.2018.
 */
public class Student extends Human implements Car, OnFoot {

 private String studentID;

 public Student() {
    }

    public String getStudentID() {
        return studentID;
    }

    public String toString(){
        return "Jestem studentem";
    }

    public String stop(){
        return "Student: Dont stop";
    }
}
