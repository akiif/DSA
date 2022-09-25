package Subsets;

import java.util.ArrayList;
import java.util.List;

/*
Time Complexity: O(N * 2^N)
where 2^N is the total number of subsets we have

Space Complexity: O(2^N * N)
2^N -> total subsets,   N -> space taken by each subset = O(N)
 */

public class SubsetOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
