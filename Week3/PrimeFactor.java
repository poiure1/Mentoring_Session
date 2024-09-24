// (G7-W3) Prime Factor 
// You are given one positive integer N. Write the program to output this number in multiplication form of prime factor.

// Input:
// •	Only one line represents one positive integer N. (2<=N<=1,000,000,000)

// Output:
// •	The only one line represents one positive integer N. (2<=N<=1,000,000,000)

// Test case:
// Input	Output
// 30	2 x 3 x 5
// 45	3 x 3 x 5

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n!=1){
            int divideNum = 2;
            while(n % divideNum != 0){
                divideNum++;
            }
            System.out.print(divideNum + " ");
            n = n/divideNum;
            if(n != 1){
                System.out.print("x ");
            }
        }
        sc.close();
    }
}