package Maths.BitManipulation;

import java.util.Arrays;

// Asked in Google
//https://leetcode.com/problems/flipping-an-image/
/*  Original     Reverse           XOR 1
1   1   0       0   1   1       1   0   0
1   0   1   =>  1   0   1   =>  0   1   0
0   0   0       0   0   0       1   1   1
 */
public class FlippingAnImage832 {
    public static void main(String[] args) {
        int[][] image =
                {
                    {1,1,0},
                    {1,0,1},
                    {0,0,0}
                };

        image = flipAndInvertImage(image);
        for (int[] arr : image) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int[] row : image) {
            int j = 0;
            // reverse this array
            for (int i = 0; i < ( image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1; // Replacing 0 with 1 and 1 with 0
                row[i] = row[image[0].length - 1 - i] ^ 1; // Replacing 0 with 1 and 1 with 0
                row[image[0].length - 1 - i] = temp;
            }
        }
        return image;
    }
}
