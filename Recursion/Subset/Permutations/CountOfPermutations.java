package Recursion.Subset.Permutations;

public class CountOfPermutations {

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(count("", str));
        System.out.println(count2("", str, 0));
    }

    static int count (String p, String up) {
        int count = 0;
        if (up.isEmpty()) {
            return ++count;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            String perm = first + ch + second;
            count += count(perm, up.substring(1));
        }

        return count;
    }

    static int count2 (String p, String up, int count) {
        if (up.isEmpty()) {
            return ++count;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            String perm = first + ch + second;
            count = count2(perm, up.substring(1), count);
        }

        return count;
    }
}
