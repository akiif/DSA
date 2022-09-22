package Recursion.Level1;

public class NumberOfZero {
    public static void main(String[] args) {
        int num = 302040;
        System.out.println(numberOfZero(num, 0));
        System.out.println(count(num));
    }

    // Recursive Approach using a helper function
    static int count (int n) {
        return numberOfZero(n, 0);
    }

    // Recursive Approach
    // If we take count inside an argument
    // special pattern, how to pass a value to above calls
    static int numberOfZero (int n, int count) {  // Also can be used as a helper func for count();
        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) {  // remainder == 0
            count++;        // OR -> return numberOfZero(n / 10, count + 1);
        }

        return numberOfZero(n / 10, count);
    }

    // Iterative Approach
    static int numberOfZero3 (int n) {
        int count = 0;

        while (n != 0) {
            if (n % 10 == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }
}
