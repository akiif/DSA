package Algorithms.BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Array elements in ascending order: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target to find in the array: ");
        int target = scanner.nextInt();

        int res = binarySearch(arr, target);

        if (res == -1) {
            System.out.println("The number " + target + " is not present in the array!");
        } else {
            System.out.println("The number " + target + " is found in the array at the index " + res + ".");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        return -1;
    }
}
