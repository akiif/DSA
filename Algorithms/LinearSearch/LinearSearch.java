package Algorithms.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target to find in the array: ");
        int target = scanner.nextInt();

        int res = linearSearch(arr, target);

        if (res == -1) {
            System.out.println("The number " + target + " is not present in the array!");
        } else {
            System.out.println("The number " + target + " is found in the array at the index " + res + ".");
        }
    }

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
