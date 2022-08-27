package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = scanner.nextInt();

        // TODO: 1-D Array
        // syntax for 1-D Array
        // data_type[] variable_name = new datatype[size]
        int arr[] = new int[size];

        int[] arr1; // declaration of array: arr1 is getting defined in the stack  //happens at compile time
        arr1 = new int[size];  //initialization: actually here object is being created in the memory (heap)  //happens at run-time

        System.out.println("Enter the array values: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // TODO: Multi-Dimensional Array (2D)
        //Multi- Dimensional Arrays:
        int[][] arr2D = new int[3][3];   //No need to specify column size;

        /*
        [
            [1. 2, 3],
            [4, 5, 6],
            [7, 8, 9]
        ]

        */

        for (int row = 0; row < arr2D.length; row++) {
            System.out.println("Enter the row " + ( row + 1 ) + " elements: ");
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = scanner.nextInt();
            }
        }


        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }
        //Or
        for (int[] a : arr2D) {
            System.out.println(Arrays.toString(a));
        }

        // TODO: 2D-Array without column-size.
        /*
        [
            [1, 2, 3],
            [4, 5],
            [6, 7, 8, 9]
        ]
        */
        int[][] arr2DnoCol = new int[3][];

        for (int row = 0; row < arr2DnoCol.length; row++) {
            System.out.print("Enter the row " + ( row + 1 ) + " size: ");
            int colSize = scanner.nextInt();
            int[] arrTemp = new int[colSize];
            System.out.println("Enter the row " + ( row + 1 ) + " elements: ");
            for (int col = 0; col < colSize; col++) {
                arrTemp[col] = scanner.nextInt();
            }
            arr2DnoCol[row] = arrTemp;
        }

        for (int[] a : arr2DnoCol) {
            System.out.println(Arrays.toString(a));
        }

        // TODO: -Dynamic Arrays (ArrayList)
        // Dynamic Arrays ---> ArrayList

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("The ArrayList items are: " + list);

        System.out.println(list.contains(2));

        list.set(0, 10);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        // TODO MultiDimensional ArrayList

        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        //Initialization
        for (int i = 0; i < 3; i++) {
            list2D.add(new ArrayList<>());
        }

        System.out.println("Enter the 2D-ArrayList elements: ");
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2D.get(i).add(scanner.nextInt());
            }
        }

        System.out.println(list2D);
    }
}
