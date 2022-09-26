package Recursion.Subset.Permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Asked in Amazon
 * https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
 * 4 -> [1, 2, 3, 4, 5, 6]
 * In how many ways can we get 4 using the dice rolls
 * Ans =>
 * It is similar to:
 * @see PermutationOfAString
 */

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
        int target = 4;
        dice("", target);
        System.out.println(diceList("", target));
        System.out.println(diceCount("", target));

        System.out.println("-----------------------------------");
        target = 10;
        System.out.println(diceList("", target));
        System.out.println(diceCount("", target));

        System.out.println("-----------------------------------");
        target = 8;
        int face = 8;
        System.out.println(diceFace("", target, face));
    }

    static void dice (String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static List<String> diceList (String p, int target) {
        List<String> list = new ArrayList<>();

        if (target == 0) {
            list.add(p);
            return list;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceList(p + i, target - i));
        }

        return list;
    }

    static int diceCount (String p, int target) {
        int count = 0;

        if (target == 0) {
            return ++count;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            count += diceCount(p + i, target - i);
        }

        return count;
    }

    // Different DieFace
    static List<String> diceFace (String p, int target, int face) {
        List<String> list = new ArrayList<>();

        if (target == 0) {
            list.add(p);
            return list;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFace(p + i, target - i, face));
        }

        return list;
    }
}
