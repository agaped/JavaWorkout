package hackerrank.warmup;

public class CatAndMouse {
    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 3, 2));

    }

    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);

        if (catA < catB) {
            return "Cat A";
        } else if (catA > catB) {
            return "Cat B";
        }
        return "Mouse C";
    }
}
