import java.util.*;
public class week2Problems {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // A. Print 1 to n
    // You are given a positive integer n.
    // Print the integers from 1 to n (inclusive), each on a separate line.

    // Input
    // The input contains a single integer n (1≤n≤2⋅105).
    // Output
    // Print n lines. On the i-th line, output the integer i (1≤i≤n).

    // int n = sc.nextInt();
    // int num = 1;
    // while(num <= n){
    //     System.out.println(num);
    //     num++;
    // }


    // B. Print N to 1
    // You are given an integer N. Print all integers from N to 1 in decreasing order.

    // Input
    // Print N integers from N to 1, separated by spaces.
    // Output
    // Print N integers from N to 1, separated by spaces.

    // int n = sc.nextInt();
    // int num = n;
    // while(num >= 1){
    //     System.out.println(num);
    //     num--;
    // }


    // C. Print All Even Numbers from 1 to N
    // You are given an integer N. Print all even numbers between 1 and N (inclusive) in increasing order.

    // Input
    // The first line contains an integer N (1≤N≤105).
    // Output
    // Print all even numbers between 1 and N, separated by spaces.
    // If there is no even number in the given range, print nothing.

    // int n = sc.nextInt();
    // int i=1;
    // while(i<=n){
    //     System.out.println(i);
    //     i+=2;
    // }

    // for(int i=1; i<=n; i++){
    //     if(i%2 == 0){
    //         System.out.println(i);
    //     }
    // }

    // D. Print from L to R
    // You are given two integers L and R. Print all integers from L to R in increasing order.

    // Input
    // The first line contains two integers L and R (−105≤L≤R≤105).

    // Output
    // Print all integers from L to R, separated by spaces.

    // int l = sc.nextInt();
    // int r = sc.nextInt();
    // while(l <= r){

    // }

    // E. Print All Uppercase Alphabets
    // Print all uppercase English alphabets from A to Z using loops.

    // Input
    // There is no input for this problem.

    // Output
    // Print all uppercase English alphabets from A to Z, separated by spaces.

    // char ch = 'A';
    // while(ch <= 'Z'){
    //     System.out.println(ch);
    //     ch++;
    // }


    // F. Print Table of N
    // You are given an integer N. Your task is to print the multiplication table of N from 1 to 10.

    // Input
    // A single integer N (1≤N≤100).

    // Output
    // Print the table of N in the format shown in the example below.


    // int n = sc.nextInt();
    // int i = 1;
    // while(i <= 10){
    //     System.out.println(n + " x " + i + " = " + (n*i));
    //     i++;
    // }


    // G. Count Numbers
    // You are given an integer N followed by N integers. Count how many of the given numbers are:
    // Positive
    // Negative
    // Even
    // Odd

    // Input
    // The first line contains an integer N  (1≤N≤105).
    // The second line contains N integers (−109≤Ai≤109).

    // Output
    // Print four integers in the following order:
    // Number of positive integers
    // Number of negative integers
    // Number of even integers
    // Number of odd integers





    // H. Sum of First N Natural Numbers
    // You are given an integer $$$N$$$. Find the sum: 1+2+3+⋯+N.

    // Input
    // The first line contains an integer N (1≤N≤106).

    // Output
    // Print a single integer — the sum of the first N natural numbers.


    // int sum = 0;
    // int n = sc.nextInt();
    // int i = 1;
    // while(i <= n){
    //     sum+=i;
    //     i++;
    // }
    // System.out.println(sum);


    // I. Factorial
    // You are given an integer N.
    // Find the factorial of N by writing a function that takes $$$N$$$ as a parameter and returns N!, where: N! = N!=1×2×3×⋯×N.

    // Input
    // The first line contains an integer N (0≤N≤20).

    // Output
    // Print the value of N!.


    // Note
    // By definition, 0!=1.
    // The constraint N≤20 ensures the answer fits in a 64-bit integer.




    // J. x^n
    // You are given two integers x and n.
    // Compute:
    // x^n=x×x×⋯×x
    // Input
    // The first line contains two integers x and n ($$$-10 \le x \le 10$$$, $$$0 \le n \le 20$$$).

    // Output
    // Print the value of x^n.
    // example: 2 3 = 2^3

    // Note
    // x0=1 for any x.
    // The constraints ensure the answer fits in a 64-bit integer.


    // K. Print Number in Reverse
    // Given an integer N, print the digits of N in reverse order.

    // Input
    // A single integer N (0≤N≤1018).

    // Output
    // Print the number formed by reversing the digits of N.

    // long n;
    // n = sc.nextLong();
    // if(n == 0){
    //     System.out.println(0);
    // }
    // while(n != 0){
    //     System.out.println(n % 10);
    //     n /= 10;
    // }


    // L. Sum Of Digits
    // Given an integer N, find the sum of its digits.

    // Input
    // A single integer N (0≤N≤10^18).

    // Output
    // Print the sum of digits of N.


    // long sum=0;
    // int n = sc.nextLong();
    // while(n != 0){
    //     sum += n % 10;
    //     n = n / 10;
    // }
    // System.out.println(sum);


    // M. Reverse Number and Store in a Variable
    // You are given a non-negative integer N.
    // Reverse the digits of N and store the result in a variable.

    // Input
    // The first line contains a non-negative integer N (0≤N≤10^9).

    // Output
    // Print the result.


    // int ans = 0;
    // int n = sc.nextInt();
    // while(n != 0){
    //     ans = (ans * 10) + n % 10;
    //     n = n / 10;
    // }
    // System.out.println(ans);


    // N. Palindrome
    // You are given a non-negative integer N. Check whether N is a palindrome or not.
    // A number is called a palindrome if it reads the same forwards and backwards.

    // Input
    // The first line contains a non-negative integer N ((0≤N≤10^18).

    // Output
    // Print YES if the number is a palindrome, otherwise print NO.
        
    }
}