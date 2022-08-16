package HashMap;
import java.util.*;

//https://leetcode.com/problems/majority-element/

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int temp;
        for (int i = 0; i < nums.length; i++) {

            if(hm.containsKey(nums[i])) {
                temp = hm.get(nums[i]);
                hm.put(nums[i], temp+1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        Iterator hmIterator = hm.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            int count = ((int)mapElement.getValue());
            if (count > max) {
                max = count;
                res = (int) mapElement.getKey();
            }
        }
        return res;
    }
}
