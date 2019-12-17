package hackerrank.warmup;

public class ViralAdvertising {


    public static void main(String[] args) {

        System.out.println(viralAdvertising(5));

    }

    static int viralAdvertising(int n) {

        int shared =5;
        int likes=0;
        int likesSum=0;

        for (int i = 0; i <n ; i++) {
            likes = Math.floorDiv(shared, 2);
            likesSum += likes;
            shared=likes*3;
        }
        return likesSum;
    }
}
