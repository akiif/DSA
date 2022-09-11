package Arrayss;

//https://leetcode.com/problems/find-the-highest-altitude/

public class FindTheHighestAltitude1732 {

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
        System.out.println("---------------------------------------");

        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(largestAltitude(gain2));
        System.out.println("---------------------------------------");
    }

    public static int largestAltitude(int[] gain) {
        int prefixSum = 0;
        int max = 0;

        for (int i : gain) {
            prefixSum += i;
            max = Math.max(max, prefixSum);
        }
        return max;
    }
}
