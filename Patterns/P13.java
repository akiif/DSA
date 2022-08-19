package Patterns;

/*
https://www.youtube.com/watch?v=8Cyb3X5j1Rw&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=64
nC0 = 1 = nCn

nCk = nCn-k

iCj+1 = (iCj * (i - j) ) / j + 1

Calculate iCj
    0       1       2       3       4       5
-----------------------------------------------
0|  1
1|  1		1
2|  1	    2		1
3|  1		3		3		1
4|  1		4		6		4		1
5|  1		5		10		10		5		1
------------------------------------------------
 5C0    5C1     5C2     5C3     5C4     5C5
*/

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}

