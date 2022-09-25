package Recursion.Subset.Permutations;

/*
Number of permutation = N!
For abc there are 3! => 9 permutations
*/

import java.util.ArrayList;

public class PermutationOfAString {
    public static void main(String[] args) {
        String str = "abc";
        permutation("", str);
        System.out.println(permutationList("", str));
    }

    static void permutation (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            String perm = first + ch + second;
            permutation(perm, up.substring(1));
        }
    }

    static ArrayList<String> permutationList (String p, String up) {

        ArrayList<String> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            String perm = first + ch + second;
            list.addAll(permutationList(perm, up.substring(1)));
        }
        return list;
    }
}
