package Arrayss;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class CheckiftheSentenceIsPangram1832 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
        str = "leetcode";
        System.out.println(checkIfPangram(str));
    }

    public static boolean checkIfPangram(String sentence) {
        int[] bucket = new int[26];
        if (sentence.length() < 26) return false;

        for (int i = 0; i < sentence.length(); i++) {
            int ch =  (int) sentence.charAt(i);
            bucket[ch - 97] =  1;
        }

        for (int i = 0; i < 26; i++) {
            if (bucket[i] != 1)
                return false;
        }

        return true;
    }
}
