package exercises;

/**
 * Created by Agunia on 07.03.2018.
 */
public class Human {

    private String name;
    private int age;
    private int pesel;

//    public Human(String name, int age, int pesel) {
//        this.name = name;
//        this.age = age;
//        this.pesel = pesel;
//    }


    public Human() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPesel() {
        return pesel;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + pesel;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (pesel != human.pesel) return false;
        return name.equals(human.name);
    }

    public String toString(){
        return "Jestem człowiekiem";
    }
}

