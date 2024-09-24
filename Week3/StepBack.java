// (G7-W3) Step Back
// You are given two Integers, return the step back of the greater integer to the smaller integer. (separate by white space (" "))

// Input:
// •	Both lines of inputs are Integer which is not sorted.
// •	It can be smaller or greater come first.

// Output:
// •	The only one line of output is Step Back from greater int to smaller int separated by whitespace (" ").
// Test case:
// Input	Output
// 2        5 5 4 5 4 3 5 4 3 2
// 5
// 20       20 20 19 20 19 18 20 19 18 17 20 19 18 17 16 20 19 18 17 16 15
// 15
// 3        3
// 3

import java.util.Scanner;

public class StepBack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = n, min = m;
        
        if(m>n){
            max=m;
            min=n;
        }
        
        for (int i=max; i>=min; i--){
            for(int j=max; j>=i; j--){
                System.out.print(j + " ");
            }
        }
        sc.close();
    }
}