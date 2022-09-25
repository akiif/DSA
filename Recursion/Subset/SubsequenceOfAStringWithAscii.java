package Recursion.Subset;

import java.util.ArrayList;

public class SubsequenceOfAStringWithAscii {

    public static void main(String[] args) {
        String str = "abc";
        subsequenceAscii("", str);
        System.out.println(subsequenceAsciiList("", str));
    }

    static void subsequenceAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsequenceAscii(p + ch, up.substring(1));   // Add the character
        subsequenceAscii(p, up.substring(1));        // Ignore the character
        subsequenceAscii(p + (ch - 0), up.substring(1));   //Ascii of that character
    }

    static ArrayList<String> subsequenceAsciiList(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            if (!p.isEmpty())
                list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        list.addAll(subsequenceAsciiList(p + ch, up.substring(1)));   // Add the character
        list.addAll(subsequenceAsciiList(p, up.substring(1)));        // Ignore the character
        list.addAll(subsequenceAsciiList(p + (ch + 0), up.substring(1)));
        return list;
    }
}
