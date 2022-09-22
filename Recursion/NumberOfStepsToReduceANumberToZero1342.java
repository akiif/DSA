package Recursion;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberOfStepsToReduceANumberToZero1342 {

    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
        System.out.println(numberOfSteps2(num));
    }


    // Iterative Approach 
    public static int numberOfSteps2 (int num) {
        int steps = 0;

        while (num != 0) {
            if ((num & 1) == 1) {
                num -= 1;
            } else {
                num /= 2;
            }
            steps++;
        }

        return steps;
    }


    // Recursive Approach
    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int n, int steps) {

        if (n == 0) {
            return steps;
        }

        steps++;

        if ((n & 1) == 1) {
            return helper(n - 1, steps);
        } else {
            return helper(n / 2, steps);
        }
    }
}
