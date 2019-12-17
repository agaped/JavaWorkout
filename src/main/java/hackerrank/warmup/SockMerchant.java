package hackerrank.warmup;

public class SockMerchant {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, 1,2,2,1,1,3,5,1,2));

    }

    static int sockMerchant(int n, int... ar) {
        int[] pairs = new int[101];
        int counter=0;

        for (int i : ar) {
            pairs[i]++;
        }
        for (int i:pairs) {
            if (i!=0) {
                counter+=i/2;
            }
        }
        return counter;
        }

    }
