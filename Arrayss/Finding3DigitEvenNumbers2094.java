package Arrayss;

//https://leetcode.com/problems/finding-3-digit-even-numbers/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Finding3DigitEvenNumbers2094 {

    //Brute Force Approach
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (digits[k] % 2 != 0 || (i == j) || (j == k) || (i == k))
                        continue;
                    int num = 100 * digits[i] + 10 * digits[j] + digits[k];
                    if ( (num > 99) && (!hm.containsKey(num))) {
                        list.add(num);
                        hm.put(num, 1);
                    }

                }
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (Integer x : list) {
            res[i] = x;
            i++;
        }
        Arrays.sort(res);
        return res;
    }
}
