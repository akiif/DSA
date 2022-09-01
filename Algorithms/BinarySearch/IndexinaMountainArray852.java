package Algorithms.BinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/

/*
Mountain array is also known as bi-tonic array
In a mountain array first the value will keep on increasing and then the value
will keep on decreasing.
First part is Ascending and the other part is descending
Example:
[0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0]
In this the peak index is 5 such that arr[i - 1] < arr[i] > arr[i + 1]
 */

public class IndexinaMountainArray852 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        System.out.println("The peak index is: " + peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + ( ( end - start ) / 2 );

            if (arr[mid] < arr[mid + 1]) { //Here it is in the ascending part of the array
                start = mid + 1;  // because we know that mid+1 element is > than mid element
            } else if (arr[mid] > arr[mid + 1]) {    //Here it is in the decreasing part of the array
                end = mid;
            }
        }
        // Finally, start == end and start will be pointing to the largest number which is the peak index
        // start and end are always trying to find the max element
        // hence when they are pointing to just one element, that is the max element
        return start;
    }

    //My Approach :-
    public static int peakIndexInMountainArray2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        return binarySearch(arr, start, end);
    }

    public static int binarySearch(int[] arr, int start, int end) {

        int mid = 0;
        while (start < end) {

            mid = start + ( ( end - start ) / 2 );

            if (arr[start] < arr[mid] && arr[mid + 1] > arr[mid]){
                start = mid;
            } else if (arr[mid - 1] > arr[mid]){
                end = mid;
            } else {
                return mid;
            }
        }
        return mid;
    }

}
