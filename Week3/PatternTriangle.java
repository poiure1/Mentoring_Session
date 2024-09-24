// (G7-W3) Pattern Triangle
// Write the program to output a triangle with height N and length of base is N by using '*' for the body of the triangle and use '-' for the white space.

// Input:
// •	Only one line represents positive integer N. (1<=N<=50)

// Output:
// •	There are N lines of output each line represents the part of the triangle.

// Test case:
// Input	Output
// 3	      --*
//          -**
//          ***
// 5	      ----*
//          ---**
//          --***
//          -****
//          *****

import java.util.Scanner;

public class PatternTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                if(j<=n-i)
                {
                    System.out.print("-");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
