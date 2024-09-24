// (G7-W3) Mathematic Question 
// We use the integers a, b, and n to create the following series:
//      (a+(2^0)b), (a+(2^0)b+a+(2^1)b), ... , (a+(2^0)b+a+(2^1)b+...+a+(2^n-1)b)
// You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

// Input:
// •	The first line contains an integer, q, denoting the number of queries. (0 <= q <= 30)
// •	Each line i of the subsequent q lines contains three space-separated integers describing the respective ai, bi, and ni values for that query. (0 <= a,b <= 50), (1 <= n <= 15)

// Output:
// •	For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

// Test case:
// Input	Output
// 2        2 6 14 30 62 126 254 510 1022 2046
// 0 2 10   8 14 26 50 98
// 5 3 5

// 3        6 12 24
// 3 3 3    0 0 0 0 0
// 0 0 5    12 24 48 96 192 384 768 1536 3072 6144
// 6 6 10 

import java.util.Scanner;

public class Mathematic{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int current = a;
            for(int j=0; j<n; j++){
                int pow = (int)Math.pow(2, j);
                current += pow*b;
                System.out.print(current+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}