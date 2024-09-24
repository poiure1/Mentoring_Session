// (G7-W3) Sum of Prime Number
// You are given 2 numbers A and B represent range of number. Output the summation of prime number in this range (exclusive).

// Input:
// •	There are two lines of input.
// •	The first line represents A as Integer. (0 <= A <= 5000)
// •	The second line represents B as Integer. (0 <= B <= 5000)

// Output:
// •	The only one line of output represents summation of Prime numbers in input range.

// Test case:
// Input	Output
// 2        10
// 7
// 10       17
// 2

import java.util.Scanner;

public class SumOfPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0, prime=0, max = n, min = m;
        
        if(m>n){
            max=m;
            min=n;
        }
        int count =0 ;
        for(int i=(min<=1?2:min); i<max; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    prime=1;
                    break;
                }
            }
            if(prime == 0){
                sum = sum+i;
                // System.out.print(i+", ");
                count++;
            }
            else{
                prime = 0;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}