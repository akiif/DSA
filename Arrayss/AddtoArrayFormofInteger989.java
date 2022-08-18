package Arrayss;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length - 1;
        List<Integer> result = new ArrayList<>();
        while(len >= 0 || k != 0) {

            if(len >= 0) {
                k += num[len];
                len--;
            }
            result.add(k % 10);
            k /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}
/*
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        long numInt = 0;

        for (int i = 0; i < num.length; i++) {
            numInt = numInt * 10 + num[i];
        }
        List<Integer> res = new ArrayList<>();
        long sum = numInt + k;
        while (sum > 0) {
            long temp = sum % 10;
            res.add( (int) temp);
            sum /= 10;
        }
        Collections.reverse(res);
        return res;
    }
}
 */
/*
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        int kNum = k;
        int j = num.length;
        List<Integer> res = new ArrayList<>();
        for (int i = num.length - 1; i >= 0 || kNum > 0 || carry == 1; i--) {
            int sum = num[i] + carry + kNum % 10;
            carry = sum / 10;
            res.add(sum % 10);
            kNum /= 10;

        }

        Collections.reverse(res);
        return res;
    }
}
 */