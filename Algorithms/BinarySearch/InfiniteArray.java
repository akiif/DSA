package Algorithms.BinarySearch;

//Asked in Amazon
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
/*
Find position of an element in a sorted array of infinite numbers
*/

public class InfiniteArray {
    public static void main(String[] args) {
        //This is actually an infinite array so we don't have to worry above overflow when we are doubling the bucket size
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 200, 210, 220, 230, 240, 250,
        260, 310, 350, 355, 450, 460, 411, 482, 490, 495, 500, 510, 550};
        int target = 250;

        int[] range = findingRange(arr, target);
        int start = range[0];
        int end = range[1];

        int pos = binarySearch(arr, target, start, end);
        System.out.println("The position to be inserted is: " + pos);
    }

    public static int[] findingRange(int[] arr, int target) {
        //Initially the bucket size will be 2 and then we will double it
        //start with the box of size 2
        int start = 0;
        int end = 1;
        int[] range = {-1, -1};

        // condition for the target to lie in the range
        while (target > arr[end]) {
            // We need to use the old end for finding new start so we are not updating end first
            int newStart = end + 1;  //this is my new start, we are not updating the start because we need to use it to find the new end.
            // double the box value
            //end = previous end + sizeofbox * 2
            //sizeofBox = end - start + 1
            end = end + (end - start + 1) * 2;   // end - (s - 1) => end - s + 1
            start = newStart;
        }
        range[0] = start;
        range[1] = end;
        return range;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + ( ( end - start ) / 2 );   //same as start + end / 2 but here int overflow might happen so this formula is used.

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
