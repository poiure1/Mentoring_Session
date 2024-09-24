// (G7-W3) Text inside-out 
// Write a Java program to print the text inside-out (reverse the text from the middle to both ends). For example, giving the text "elephant", the output is "peletnah". If the given text is "hello", the output should be "ehlol".

// Input:
// •	Only one line of input represents the given text.
// •	The length of text will not exceed 1,000.

// Output:
// •	Only one line of output represents the text inside-out.

// Test case:
// Input	Output
// hello	ehlol
// elephant	peletnah

import java.util.Scanner;
public class TextInsideOut {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for(int i = (str.length()-2)/2; i>=0;i--){
            System.out.print(str.charAt(i));
        }
        if(str.length() %2!= 0){
            System.out.print(str.charAt((str.length()-1)/2));
        }
        for(int i=str.length()-1; i>(str.length()-1)/2; i--){
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}