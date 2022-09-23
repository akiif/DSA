package Recursion.ArraysR;

import java.util.ArrayList;

public class LinearSearchAllIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 6, 8, 4, 10};
        int target = 4;
        findAllIndex(arr, target, 0);
        System.out.println(list);
        System.out.println(findAllIndex1(arr, target, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, target, 0));
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex (int[] arr, int target, int index) {
        // base condition
        if (index == arr.length) {  // this works for an empty array as well
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }

    // Write a recursive function to return an ArrayList.
    // Approach 1: By passing an argument.
    // Here all the lists are pointing to the same object.
    static ArrayList<Integer> findAllIndex1 (int[] arr, int target, int index, ArrayList<Integer> list) {
        // base condition
        if (index == arr.length) {  // this works for an empty array as well
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndex1(arr, target, index + 1, list);
    }

    // Approach 2: Return the list without passing an argument.
    // Here new list object is being created in each function call.
    static ArrayList<Integer> findAllIndex2 (int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        // base condition
        if (index == arr.length) {  // this works for an empty array as well
            return list;
        }

        // this will contain answer for that function  call only
        if (arr[index] == target) {
            list.add(index);
        }
        list.addAll(findAllIndex2 (arr, target, index + 1));
        return list;
    }

    static ArrayList<Integer> findAllIndex3 (int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        // base condition
        if (index == arr.length) {  // this works for an empty array as well
            return list;
        }

        // this will contain answer for that function  call only
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

}

