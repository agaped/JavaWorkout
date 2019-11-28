package hackerrank.warmup.arrays;

import java.util.HashMap;
import java.util.Map;

public class DesignerPDFViewer {

    public static void main(String[] args) {

        int[] h = {1,3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        System.out.println(designerPdfViewer(h,"abcffg"));
        System.out.println(designerPdfViewerSimplified(h,"abcffg"));
    }

    static int designerPdfViewer(int[] h, String word) {

        int maxHeight = 0;
        int height=0;
        Map<Character, Integer> alphabet = new HashMap<>();
        char letter = 'a';

        for (int i = 0; i < h.length; i++, letter++) {
            alphabet.put(letter, h[i]);
        }

        for (char c: word.toCharArray()) {
            height = alphabet.get(c);
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        return maxHeight * word.length();

    }

    static int designerPdfViewerSimplified(int[] h, String word) {
        int height=0;

        for (char c: word.toCharArray()) {
            height = Math.max(height,h[c-'a']);
        }

        return height * word.length();
    }

}
