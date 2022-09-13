package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10, 12, 15, 20, 25};
        int target = 20;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return search(arr, target, mid + 1, end);
        } else {
            return search(arr, target, start, mid - 1);
        }
    }
}
