// (G7-W3) Multiplication table
// Write a Java program that generates the multiplication table for the number n from 1 to 12.

// Input:
// •	Only one line represents integer n. (0 <= n >= 2,147,483,647)

// Output:
// •	The 12 line of output represents the multiplication table for the number n.

// Test Case
// Input	Output
// 2	      2 x 1 = 2
//          2 x 2 = 4
//          2 x 3 = 6
//          2 x 4 = 8
//          2 x 5 = 10
//          2 x 6 = 12
//          2 x 7 = 14
//          2 x 8 = 16
//          2 x 9 = 18
//          2 x 10 = 20
//          2 x 11 = 22
//          2 x 12 = 24

import java.util.Scanner;
public class MultiplicationTable {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    for (int i = 1; i <= 12; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }
    sc.close();
  }
}
