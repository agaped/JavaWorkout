package exercises;

import exercises.Human;

import java.util.Set;

/**
 * Created by Agunia on 07.03.2018.
 */
public class Main {
    public static void main(String[] args){

        short shortValue = 1;
        int intValue = 1;
        long longValue = 2;
        float floatValue = 3.1F;
        double doubleValue = 4.1;

        System.out.println(intValue + doubleValue);
        System.out.println(intValue + floatValue);
        System.out.println(intValue + longValue);
        System.out.println(shortValue + shortValue);

        char aAsChar = 'a';
        System.out.println(aAsChar);
        int aAsInt = aAsChar;
        System.out.println(aAsInt);

        int ninetyEightAsInt = 98;
        System.out.println(ninetyEightAsInt);
        char ninetyoneAsChar = (char) ninetyEightAsInt;
        System.out.println(ninetyoneAsChar);

        System.out.println("10 == 10: " + (10 == 10));
        System.out.println();
        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + new String("test").equals(new String("test")));
        String a="test";
        String b="test";
        System.out.println("a == b: " + (a == b));
        System.out.println("a equals b: " + (a.equals(b)));

//        Human Ala=new Human("Ala", 21, 23432);
//        Human Ola=new Human("Ala", 21, 23432);
//
//        System.out.println("Ala equals Ola: "+Ala.equals(Ola));

        System.out.println();
        Student student=new Student();
        Human student1=new Student();

        System.out.println("Student type Student: "+student.toString());
        System.out.println("Student1 type Human: "+student1.toString()); //tu działa polimorfizm
        System.out.println("Student type Student: "+student.getStudentID());
        //System.out.println("Student1 type Human: "+student1.getStudentID()); //bład kompilatora
       // Student student2=new Human(); //bład
       // Student student2= (Student) new Human(); //musi byc rzutowanie

        Student student2=(Student)student1;  //musimy go zrzutowac

        System.out.println("\nModulo zmienno przecinkowe");
        System.out.println("1.2%6 = "+(1.2%6));

        System.out.println("\n 0/0 = "+0+0.0); // 0/0 = 00.0
        System.out.println("\n 0/0 = "+0/0.0); // / ma wyższy priorytet niz +

        System.out.println("\nMetody default interfejsy java 8");
        Student ala=new Student();
        System.out.println(ala.drive());
        System.out.println(ala.walk());
        System.out.println(ala.stop()); //2 takie same metody default z róznych interfejsów tzreba nadpisac

        Car studentCar=new Student();
        System.out.println(studentCar.stop()); //działa polimorfizm
    }

//    public class Example {
//        public void print(Set<String> strSet)
//        { }
//        public void print(Set<Integer> intSet) //to nie jest metoda przeciązona!!
//        { }
    }

