// (G7-W3) Array sort 
// Write a Java program to sort an array of integer.

// Input:
// •	First line represents one positive integer N which is size of array. (0 <= N <= 200)
// •	Second line represents all element in array of integer.

// Output:
// •	The only one line represents a sorted array of given integer.

// Test case:
// Input	                        Output
// 5                                [1, 2, 23, 46, 93]
// 93 2 1 46 23
// 10                               [1, 2, 4, 7, 12, 23, 24, 45, 67, 323]
// 23 323 4 45 7  1 67 12 2 24

import java.util.Scanner;
import java.util.Arrays;

public class ArraySort{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}