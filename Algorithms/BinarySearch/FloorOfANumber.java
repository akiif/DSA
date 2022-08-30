package Algorithms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the target to find in the array: ");
        int target = scanner.nextInt();

        //return the index of greatest number <= target
        int res = binarySearch(arr, target);
        if (res < 0 || res >= arr.length) {
            System.out.println("The floor of the number is not present.");
        } else {
            System.out.println("The floor of the number is: " + arr[res]);
        }

    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // if target is smaller than the smallest number in the array
        if (target < arr[start])
            return -1;

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );   //same as start + end / 2 but here int overflow might happen so this formula is used.

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
