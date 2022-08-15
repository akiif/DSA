package Patterns;

/*
https://www.youtube.com/watch?v=ArnoqgUbN8I&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=39

        *
      * *
    * * *
  * * * *
* * * * *

*/

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int diff = n - i;
            for (int j = 1; j <= n; j++) {
                if(j <= diff)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
