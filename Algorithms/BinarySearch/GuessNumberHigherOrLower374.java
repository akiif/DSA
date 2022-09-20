package Algorithms.BinarySearch;

public class GuessNumberHigherOrLower374 {

    static int pick = 6;

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The guessed number is: " + guessNumber(n));
    }

    public static int guessNumber(int n) {

        int start = 0;
        int end = n;

        while (true) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public static int guess (int n) {
        return Integer.compare(pick, n);
    }
}
